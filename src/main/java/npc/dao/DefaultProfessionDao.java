package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import npc.entity.Profession;
import npc.entity.ProfessionType;

@Component
public class DefaultProfessionDao implements ProfessionDao{
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Profession> fetchAllProfessions() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM professions";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Profession>() {
      
      public Profession mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Profession.builder()
            .professionPk(rs.getLong("profession_pk"))
            .professionId(ProfessionType.valueOf(rs.getString("profession_id")))
            .build();
      }
    });
  }

}
