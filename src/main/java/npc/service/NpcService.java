package npc.service;

import java.util.List;
import npc.entity.Npc;

public interface NpcService {

  // GET
  List<Npc> fetchAllNpcs();
  
  List<Npc> fetchNpcById(int npcId);
  
//switching to int to see if that's my problem
//  Npc createNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality);
//taking out the npcId to see if the KeyHolder will work to fill it in.
//  Npc createNpc(Integer npcId, Integer name, Integer species, Integer background,
//      Integer profession, Integer personality);
  //Testing whether the KeyHolder will generate the npcId for me.
  Npc createNpc(Integer name, Integer species, Integer background,
      Integer profession, Integer personality);
  
//  Npc updateNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality);
  Npc updateNpc(Integer npcId, Integer name, Integer species, Integer background,
      Integer profession, Integer personality);

  Npc deleteNpc(Integer npcId);

 
}
