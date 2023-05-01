package npc.dao;

import java.util.List;
import npc.entity.Npc;

public interface NpcDao {
  Npc createRandomNPC();
  
  List<Npc> fetchAllNpcs();
  
  Npc fetchNpcById(int npcId);
  
  Npc updateNpcById(int npcId);
  
  Npc deleteNpcById(int npcId);
}
