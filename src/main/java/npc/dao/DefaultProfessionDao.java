package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Profession;
import npc.entity.ProfessionType;

@Component
@Slf4j
public class DefaultProfessionDao implements ProfessionDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  
  @Override
  public List<Profession> fetchRandomProfession() {
    log.info("DAO: fetching a random profession");
    // @formatter:off
    String sql = "SELECT * FROM ( "
        + "(SELECT * FROM professions ORDER BY RAND() LIMIT 1) "
        + "UNION "
        + "(SELECT * FROM professions ORDER BY RAND() LIMIT 1) "
        + ") AS combined_result "
        + "ORDER BY RAND() LIMIT 2; ";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Profession mapRow(ResultSet rs, int rowNum) throws SQLException {
        // @formatter:off
        return Profession.builder()
            .professionPk(rs.getLong("profession_pk"))
            .professionId(ProfessionType.valueOf(rs.getString("profession_id")))
            .build();
        // @formatter:on
      }
      });
  }

}
