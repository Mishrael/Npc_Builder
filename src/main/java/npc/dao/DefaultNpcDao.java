package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Npc;

@Component
@Slf4j
public class DefaultNpcDao implements NpcDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }

/*
 *  GET
 */
  @Override
  public List<Npc> fetchAllNpcs() {
    // @formatter:off
    String sql = ""
        + "SELECT * FROM npcs";
    //@formatter:on
    
    return jdbcTemplate.query(sql, new RowMapper<Npc>() {
      
      public Npc mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // @formatter:off
        return Npc.builder()
            .name(rs.getLong("name_fk"))
            .species(rs.getLong("species_fk"))
            .personality(rs.getLong("personality_fk"))
            .background(rs.getLong("background_fk"))
            .profession(rs.getLong("profession_fk"))
            .build();
      }
    });
  }
//@Override
//public List<Npc> fetchAllNpcs() {
//  // @formatter:off
//  String sql = ""
//      + "SELECT * FROM npcs";
//  //@formatter:on
//  
//  return jdbcTemplate.query(sql, new RowMapper<Npc>() {
//    
//    public Npc mapRow(ResultSet rs, int rowNum) throws SQLException {
//      
//      // @formatter:off
//      return Npc.builder()
//          .name(rs.getString("name_fk"))
//          .species(SpeciesType.valueOf(rs.getString("species_fk")))
//          .personality(PersonalityType.valueOf(rs.getString("personality_fk")))
//          .background(BackgroundType.valueOf(rs.getString("background_fk")))
//          .profession(ProfessionType.valueOf(rs.getString("profession_fk")))
//          .build();
//    }
//  });
//}
//  private Long npcPk;
//  private Name name;
//  private Species species;
//  private Background background;
//  private List<Profession> professions;
//  private Personality personality;
  
  @Override
  public List<Npc> fetchNpcById(int npcId) {
    // @formatter:off
    String sql = ""
        + "SELECT * "
        + "From npcs "
        + "Where npc_id = :npc_id";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("npc_id", npcId);
    
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      public Npc mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Npc.builder()
            .npcId(rs.getLong(npcId))
            .name(rs.getLong("name_fk"))
            .species(rs.getLong("species_fk"))
            .personality(rs.getLong("personality_fk"))
            .background(rs.getLong("background_fk"))
            .profession(rs.getLong("profession_fk"))
            .build();
      }
    });
  }

/*
 * POST
 */
  @Override
  public Npc createNpc(Long name, Long species, Long background, Long profession,
      Long personality) {
    SqlParams params = new SqlParams();
    KeyHolder keyHolder = new GeneratedKeyHolder();
    
    //@formatter:off
    params.sql= ""
        +"INSERT INTO npcs "
        +"(name_fk, species_fk, personality_fk, background_fk, profession_fk) "
        +"VALUES (:name_fk, :species_fk, :personality_fk, :background_fk, :profession_fk)";
    //@formatter:on
    
    params.source.addValue("name_fk", name);
    params.source.addValue("species_fk", species);
    params.source.addValue("personality_fk", personality);
    params.source.addValue("background_fk", background);
    params.source.addValue("profession_fk", profession);
    
    jdbcTemplate.update(params.sql, params.source, keyHolder);
    
    long npcId = keyHolder.getKey().intValue();
    
    // @formatter:off
    return Npc.builder()
        .npcId(npcId)
        .name(name)
        .species(species)
        .personality(personality)
        .background(background)
        .profession(profession)
        .build();
    // @formatter:on
  }

  /*
   * PUT
   */
  @Override
  public Npc updateNpc(Long npcId, Long name, Long species, Long background, Long profession, 
      Long personality) {
      //@formatter:off
        String sql = ""
            +"UPDATE npcs "
            +"SET "
            +"name_fk = :name_fk, "
            +"species_fk = :species_fk, "
            +"background_fk = :background_fk, "
            +"profession_fk = :profession_fk, "
            +"personality_fk = :personality_fk "
            +"WHERE npc_id = :npc_id";
        //@formatter:on
        
        Map<String, Object> params = new HashMap<>();
        params.put("npc_id", npcId);
        params.put("personality_fk", personality);
        params.put("profession_fk", profession);
        params.put("background_fk", background);
        params.put("species_fk", species);
        params.put("name_fk", name);
        
        if(jdbcTemplate.update(sql, params) == 0) {
          throw new NoSuchElementException("Could not update npc");
        }
        
     // @formatter:off
        return Npc.builder()
            .npcId(npcId)
            .name(name)
            .species(species)
            .personality(personality)
            .background(background)
            .profession(profession)
            .build();
    // @formatter:on
  }
  
  /*
   * DELETE
   */
  @Override
  public void deleteNpc(Long npcId) {
    // @formatter:off
    String sql = ""
        + "DELETE FROM npcs "
        + "Where npc_id = :npc_id";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("npc_id", npcId);
    
    if(jdbcTemplate.update(sql, params) == 0) {
      throw new NoSuchElementException("Could not delete npc");
    }
  }

}
