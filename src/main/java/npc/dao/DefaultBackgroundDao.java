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
import npc.entity.Background;
import npc.entity.Ethnicity;
import npc.entity.Profession;
import npc.entity.Status;

@Component
@Slf4j
public class DefaultBackgroundDao implements BackgroundDao {
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Background> fetchRandomBackground() {
    log.info("DAO: fetching a random background");
    // @formatter:off
    String sql = "SELECT * "
        + "FROM backgrounds "
        + "ORDER BY RAND() "
        + "LIMIT 1";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Background mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Background.builder()
            .backgroundPk(rs.getLong("background_pk"))
            .backgroundId(rs.getString("background_id"))
            .ethnicity(Ethnicity.valueOf(rs.getString("ethnicity")))
            .status(Status.valueOf(rs.getString("status")))
            .build(); 
      }
    });
    
  }

}
