package npc.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Background;
import npc.entity.Name;
import npc.entity.Npc;
import npc.entity.Personality;
import npc.entity.Profession;
import npc.entity.Species;

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
