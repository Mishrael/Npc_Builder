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
  
  @Autowired
  private DefaultProfessionDao defaultProfessionDao;
  
  @Override
  public List<Background> fetchRandomBackground() {
    List<Profession> profession = defaultProfessionDao.fetchRandomProfession();
    log.info("DAO: fetching a random background");
    // @formatter:off
    String sql = "SELECT background_id "
        + "FROM backgrounds "
        + "ORDER BY RAND() "
        + "LIMIT :limit";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("limit", ThreadLocalRandom.current().nextInt(1, 3));
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Background mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Background.builder()
            .backgroundPk(rs.getLong("background_pk"))
            .backgroundId(rs.getString("background_id"))
            .ethnicity(Ethnicity.valueOf(rs.getString("ethnicity")))
            .status(Status.valueOf(rs.getString("status")))
            .professions(profession)
           //add profession fetchRandomProfession somehow
            .build(); 
      }
    });
    
  }

}
