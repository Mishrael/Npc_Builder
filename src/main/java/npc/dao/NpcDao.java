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
  Npc createNpc(Long name, Long species, Long background, Long profession,
      Long personality);

  // PUT
  Npc updateNpc(Long npcId, Long name, Long species, Long background, Long profession, Long personality);

  void deleteNpc(Long npcId);

}
