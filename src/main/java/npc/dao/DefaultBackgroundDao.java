package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import npc.entity.Background;
import npc.entity.BackgroundType;

@Component
public class DefaultBackgroundDao implements BackgroundDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Background> fetchAllBackgrounds() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM backgrounds";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Background>() {
      
      public Background mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Background.builder()
            .backgroundPk(rs.getInt("background_pk"))
            .backgroundId(BackgroundType.valueOf(rs.getString("background_id")))
            .build();
      }
    });
  }

}
