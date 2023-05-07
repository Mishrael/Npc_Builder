package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Species;
import npc.entity.SpeciesType;

@Component
@Slf4j
public class DefaultSpeciesDao implements SpeciesDao {
  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Species> fetchAllSpecies() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM species";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Species>() {
      
      public Species mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Species.builder()
            .speciesPk(rs.getLong("species_pk"))
            .speciesId(SpeciesType.valueOf(rs.getString("species_id")))
            .description(rs.getString("description"))
            .build();
      }
    });
  }

}
