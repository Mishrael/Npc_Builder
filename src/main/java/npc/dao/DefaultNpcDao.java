package npc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Background;
import npc.entity.BackgroundType;
import npc.entity.Name;
import npc.entity.NameOrigin;
import npc.entity.Npc;
import npc.entity.Personality;
import npc.entity.PersonalityType;
import npc.entity.Profession;
import npc.entity.ProfessionType;
import npc.entity.Species;
import npc.entity.SpeciesType;

@Service
@Slf4j
public class DefaultNpcDao implements NpcDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }
  
  private SqlParams generateInsertSql(Profession profession, Background background) {
    SqlParams params = new SqlParams();
    
    // @formatter:off
    params.sql = ""
        + "INSERT INTO backgrounds_professions "
        + "(background_fk, profession_fk) "
        + "VALUES "
        + "(:background_fk, :profession_fk)";
    // @formatter:on
    
    params.source.addValue("background_fk", profession.getProfessionPk());
    params.source.addValue("profession_fk", background.getBackgroundPk());
    return params;
  }
  
  private SqlParams generateInsertSql(Name name, Species species, Personality personality) {
    // @formatter:off
    String sql = ""
        + "INSERT INTO npcs "
        + "(name_fk, species_fk, personality_fk) "
        + "VALUES "
        + "(:name_fk, :species_fk, :personality_fk)";
    // @formatter:on
    
    SqlParams params = new SqlParams();
    
    params.sql = sql;
    params.source.addValue("name_fk", name.getNamePk());
    params.source.addValue("species_fk", species.getSpeciesPk());
    params.source.addValue("personality_fk", personality.getPersonalityPk());
    
    return params;
  }
  
  private void saveProfession(List<Profession> professions, Background background) {
    for(Profession profession : professions) {
      SqlParams params = generateInsertSql(profession, background); 
      jdbcTemplate.update(params.sql, params.source);
    }
  }
  
  @Override
  public Npc saveRandomNPC(Name name, Species species, Personality personality, 
      Background background, List<Profession> professions) {

    SqlParams params = generateInsertSql(name, species, personality);
    
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(params.sql, params.source, keyHolder);
    
    Long npcPk = keyHolder.getKey().longValue();
    
    // @formatter:off
    return Npc.builder()
        .npcPk(npcPk)
        .name(name)
        .species(species)
        .personality(personality)
        .background(background)
        .professions(professions)
        .build();
    // @formatter:on
  }

  @Override
  public Name fetchRandomName() {
 // @formatter:off
    String sql = "SELECT * "
        + "FROM name "
        + "ORDER BY RAND() "
        + "LIMIT 1";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    return (Name) jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Name mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Name.builder()
            .nameId(rs.getString("name_id"))
            .namePk(rs.getLong("name_pk"))
            .origin(NameOrigin.valueOf(rs.getString("name_origin")))
            .build(); 
      }
    });
  }

  @Override
  public Species fetchRandomSpecies() {
    // @formatter:off
       String sql = "SELECT * "
           + "FROM species "
           + "ORDER BY RAND() "
           + "LIMIT 1";
       // @formatter:on
       
       Map<String, Object> params = new HashMap<>();
       return (Species) jdbcTemplate.query(sql, params, new RowMapper<>() {
         
         public Species mapRow(ResultSet rs, int rowNum) throws SQLException {
           return Species.builder()
               .speciesPk(rs.getLong("species_pk"))
               .speciesId(SpeciesType.valueOf(rs.getString("species_id")))
               .description(rs.getString("description"))
               .build(); 
         }
       });
  }

  @Override
  public Personality fetchRandomPersonality() {
 // @formatter:off
    String sql = "SELECT * "
        + "FROM personalities "
        + "ORDER BY RAND() "
        + "LIMIT 1";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    return (Personality) jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Personality mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Personality.builder()
            .personalityPk(rs.getLong("background_pk"))
            .personalityId(PersonalityType.valueOf(rs.getString("personality_id")))
            .traits(rs.getString("traits"))
            .description(rs.getString("description"))
            .build(); 
      }
    });
  }

  @Override
  public Background fetchRandomBackground() {
    // @formatter:off
    String sql = "SELECT * "
        + "FROM backgrounds "
        + "ORDER BY RAND() "
        + "LIMIT 1";
    // @formatter:on
    
    Map<String, Object> params = new HashMap<>();
    return (Background) jdbcTemplate.query(sql, params, new RowMapper<>() {
      
      public Background mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Background.builder()
            .backgroundPk(rs.getLong("background_pk"))
            .backgroundId(BackgroundType.valueOf(rs.getString("background_id")))
            .build(); 
      }
    });
  }

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
  
  @Override
  public List<Npc> fetchAllNpcs() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Npc fetchNpcByPk(int npcPk) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Npc updateNpcByPk(int npcPk) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Npc deleteNpcByPk(int npcPk) {
    // TODO Auto-generated method stub
    return null;
  }

}
