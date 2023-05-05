package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.MasteryLevel;
import npc.entity.Profession;

@Component
@Slf4j
public class DefaultProfessionDao implements ProfessionDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  
  @Override
  public List<Profession> fetchRandomProfession() {
    log.info("DAO: fetching a random profession");
    // @formatter:off
    String sql = "SELECT profession_id "
        + "FROM professions "
        + "ORDER BY RAND() "
        + "LIMIT :limit";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("limit", ThreadLocalRandom.current().nextInt(1, 3));
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Profession mapRow(ResultSet rs, int rowNum) throws SQLException {
        // @formatter:off
        return Profession.builder()
            .professionPk(rs.getLong("profession_pk"))
            .professionId(rs.getString("profession_id"))
            .masteryLevel(MasteryLevel.valueOf(rs.getString("mastery_level")))
            .build();
        // @formatter:on
      }
    });
  }

}
