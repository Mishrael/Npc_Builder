package npc.dao;

import java.math.BigDecimal;
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
import npc.entity.Background;
import npc.entity.Name;
import npc.entity.Npc;
import npc.entity.Personality;
import npc.entity.Profession;
import npc.entity.Species;

@Component
@Slf4j
public class DefaultNpcDao implements NpcDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }
  
  // Maybe a generateInsertSql method to inject values into my C, U, and D ops? 
  // How do I feed values through to my tables??
//  private SqlParams generateInsertSql(Long name, Long species, Long background,
//      Long profession, Long personality) {
//    // @formatter:off
//    String sql = ""
//        +"INSERT INTO npcs "
//        +"(name_fk, species_fk, personality_fk, background_fk, profession_fk) "
//        +"VALUES (:name_fk, :species_fk, :personality_fk, :background_fk, :profession_fk)";
//    // @formatter:on
//    
//    SqlParams params = new SqlParams();
//    
//    params.sql = sql;
//    params.source.addValue("name_fk", name.getLong(sql));
//    params.source.addValue("species_fk", species.getLong(sql));
//    params.source.addValue("personality_fk", personality.getLong(sql));
//    params.source.addValue("background_fk", background.getLong(sql));
//    params.source.addValue("profession_fk", profession.getLong(sql));
//    
//    return params;
//  }

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
            .npcId(rs.getInt("npc_id"))
            .name(rs.getInt("name_fk"))
            .species(rs.getInt("species_fk"))
            .personality(rs.getInt("personality_fk"))
            .background(rs.getInt("background_fk"))
            .profession(rs.getInt("profession_fk"))
            .build();
      }
    });
  }
  // What I'd like to eventually do, but due to my tables, I have to pass through Longs.
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
    // Trying different stuff to make things work.
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
//        + "FROM npcs";
        + "FROM npcs "
        + "Where npc_id = :npc_id";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("npc_id", npcId);
    
    return jdbcTemplate.query(sql, params, new RowMapper<>() {
      public Npc mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Npc.builder()
            .npcId(rs.getInt(npcId))
            .name(rs.getInt("name_fk"))
            .species(rs.getInt("species_fk"))
            .personality(rs.getInt("personality_fk"))
            .background(rs.getInt("background_fk"))
            .profession(rs.getInt("profession_fk"))
            .build();
      }
    });
  }

/*
 * POST
 */
  @Override
    //switching to int to see if that's my problem
//  public Npc createNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality) {
    //taking out the npcId to see if the KeyHolder will work to fill it in.
//  public Npc createNpc(Integer npcId, Integer name, Integer species, Integer background,
//      Integer profession, Integer personality) {
    //Testing whether the KeyHolder will generate the npcId for me.
  public Npc createNpc(Integer name, Integer species, Integer background,
      Integer profession, Integer personality) {
    SqlParams params = new SqlParams();
//   Don't think generateInsertSql is the move. Well at least this one.
//    SqlParams params = generateInsertSql(name, species, background, profession, personality);
    KeyHolder keyHolder = new GeneratedKeyHolder();
    
    // name_fk is getting passed a null value
    // maybe try without SqlParams object?
    // @formatter:off
    params.sql= ""
        +"INSERT INTO npcs "
        +"(name_fk, species_fk, personality_fk, background_fk, profession_fk) "
        +"VALUES (:name_fk, :species_fk, :personality_fk, :background_fk, :profession_fk)";
    // @formatter:on
//    // @formatter:off
//      String sql= ""
//        +"INSERT INTO npcs "
//        +"(name_fk, species_fk, personality_fk, background_fk, profession_fk) "
//        +"VALUES (:name_fk, :species_fk, :personality_fk, :background_fk, :profession_fk)";
//    // @formatter:on
    
//    Map<String, Object> params = new HashMap<>();
//    params.put("name_fk", name);
//    params.put("species_fk", species);
//    params.put("personality_fk", personality);
//    params.put("background_fk", background);
//    params.put("profession_fk", profession);
    params.source.addValue("name_fk", name);
    params.source.addValue("species_fk", species);
    params.source.addValue("personality_fk", personality);
    params.source.addValue("background_fk", background);
    params.source.addValue("profession_fk", profession);
    
    jdbcTemplate.update(params.sql, params.source, keyHolder);
//    jdbcTemplate.update(sql, params);
    
    int npcId = keyHolder.getKey().intValue();
    
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
  public Npc updateNpc(Integer npcId, Integer name, Integer species, Integer background, 
      Integer profession, Integer personality) {
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
  public Npc deleteNpc(Integer npcId) {
    // @formatter:off
    String sql = ""
        + "DELETE FROM npcs "
        + "WHERE npc_id = :npc_id";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("npc_id", npcId);
    
    if(jdbcTemplate.update(sql, params) == 0) {
      throw new NoSuchElementException("Could not delete npc");
    }
    jdbcTemplate.update(sql, params);
    
    return Npc.builder().npcId(npcId).build();
  }

}
