package npc.dao;

import java.util.List;
import npc.entity.Background;
import npc.entity.Name;
import npc.entity.Npc;
import npc.entity.Personality;
import npc.entity.Profession;
import npc.entity.Species;

public interface NpcDao {
  Npc saveRandomNPC(Name name, Species species, Personality personality, 
      Background background, List<Profession> professions);
  
  List<Npc> fetchAllNpcs();
  
  Npc fetchNpcByPk(int npcPk);
  
  Npc updateNpcByPk(int npcPk);
  
  Npc deleteNpcByPk(int npcPk);
}
