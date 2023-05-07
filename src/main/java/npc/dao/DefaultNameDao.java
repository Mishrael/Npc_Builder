package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import npc.entity.Name;
import npc.entity.NameOrigin;

@Component
public class DefaultNameDao implements NameDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Name> fetchAllNames() {
 // @formatter:off
    String sql = ""
        + "SELECT * FROM names";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Name>() {
      
      public Name mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Name.builder()
            .namePk(rs.getInt("name_pk"))
            .nameId(rs.getString("name_id"))
            .origin(NameOrigin.valueOf(rs.getString("name_origin")))
            .build();
      }
    });
  }

}
