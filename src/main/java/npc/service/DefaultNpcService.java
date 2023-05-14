package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import npc.dao.NpcDao;
import npc.entity.Name;
import npc.entity.Npc;

@Service
public class DefaultNpcService implements NpcService{
  
  @Autowired
  private NpcDao npcDao;

  @Transactional(readOnly = true)
  @Override
  public List<Npc> fetchAllNpcs() {
    List<Npc> npc = npcDao.fetchAllNpcs();
    return npc;
  }
  
  @Transactional(readOnly = true)
  @Override
  public List<Npc> fetchNpcById(int npcId) {
    List<Npc> npc = npcDao.fetchNpcById(npcId);
    return npc;
  }
 
  // POST
    // Trying with Integer
//  @Override
//  public Npc createNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality) {
//    return npcDao.createNpc(npcId, name, species, background, profession, personality);
//  }
  
  @Override
//switching to int to see if that's my problem
//  public Npc createNpc(Integer npcId, Integer name, Integer species, Integer background,
//      Integer profession, Integer personality) {
  //Testing whether the KeyHolder will generate the npcId for me.
  public Npc createNpc(Integer name, Integer species, Integer background,
      Integer profession, Integer personality) {
    // TODO Auto-generated method stub
//    return npcDao.createNpc(npcId, name, species, background, profession, personality);
    return npcDao.createNpc(name, species, background, profession, personality);
  }

  // PUT
//  @Override
//  public Npc updateNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality) {
//    return npcDao.updateNpc(npcId, name, species, background, profession, personality);
//  }
  @Override
  public Npc updateNpc(Integer npcId, Integer name, Integer species, Integer background,
      Integer profession, Integer personality) {
    return npcDao.updateNpc(npcId, name, species, background, profession, personality);
  }

  // DELETE
  @Override
  public Npc deleteNpc(Integer npcId) {
    return npcDao.deleteNpc(npcId);
  }


}
