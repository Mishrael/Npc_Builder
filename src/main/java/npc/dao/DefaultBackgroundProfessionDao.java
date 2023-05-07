package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import npc.entity.BackgroundProfession;

@Component
public class DefaultBackgroundProfessionDao implements BackgroundProfessionDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<BackgroundProfession> fetchAllBackgroundProfessions() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM backgrounds_professions";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<BackgroundProfession>() {
      
      public BackgroundProfession mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return BackgroundProfession.builder()
            .BackgroundId(rs.getInt("background_fk"))
            .ProfessionId(rs.getInt("profession_fk"))
            .build();
      }
    });
  }

}
