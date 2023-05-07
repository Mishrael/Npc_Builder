package npc.service;

import java.util.List;
import npc.entity.Npc;

public interface NpcService {

  // GET
  List<Npc> fetchAllNpcs();
  
  List<Npc> fetchNpcById(int npcId);
  
  Npc createNpc(Long name, Long species, Long background, Long profession,
      Long personality);

  Npc updateNpc(Long npcId, Long name, Long species, Long background, Long profession,
      Long personality);

  void deleteNpc(Long npcId);


 
}
