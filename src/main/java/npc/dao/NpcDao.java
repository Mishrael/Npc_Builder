package npc.dao;

import java.util.List;
import npc.entity.Background;
import npc.entity.Name;
import npc.entity.Npc;
import npc.entity.Personality;
import npc.entity.Profession;
import npc.entity.Species;

public interface NpcDao {
//  Npc createRandomNPC(Name name, Species species, Personality personality, 
//      Background background, List<Profession> professions);
//  
//  Name fetchRandomName();
//  Species fetchRandomSpecies();
//  Personality fetchRandomPersonality();
//  Background fetchRandomBackground();
//  List<Profession> fetchRandomProfession();
  
  // GET
  List<Npc> fetchAllNpcs();
  
  List<Npc> fetchNpcById(int npcId);

  // POST
//switching to int to see if that's my problem
//  Npc createNpc(Long npcId, Long name, Long species, Long background, 
//      Long profession, Long personality);
//taking out the npcId to see if the KeyHolder will work to fill it in.
//  Npc createNpc(Integer npcId, Integer name, Integer species, Integer background,
//      Integer profession, Integer personality);
  //Testing whether the KeyHolder will generate the npcId for me.
  Npc createNpc(Integer name, Integer species, Integer background,
      Integer profession, Integer personality);

  // PUT
//  Npc updateNpc(Long npcId, Long name, Long species, Long background,
//      Long profession, Long personality);

  Npc updateNpc(Integer npcId, Integer name, Integer species, Integer background,
      Integer profession, Integer personality);

  Npc deleteNpc(Integer npcId);

}
