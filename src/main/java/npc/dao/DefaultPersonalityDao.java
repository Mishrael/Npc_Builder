package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import npc.entity.Personality;
import npc.entity.PersonalityType;

@Component
public class DefaultPersonalityDao implements PersonalityDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Personality> fetchAllPersonalities() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM personalities";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Personality>() {
      
      public Personality mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Personality.builder()
            .personalityPk(rs.getLong("personality_pk"))
            .personalityId(PersonalityType.valueOf(rs.getString("personality_id")))
            .traits(rs.getString("traits"))
            .description(rs.getString("description"))
            .build();
      }
    });
  }

}
