package npc.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import npc.controller.model.NpcDto;
import npc.entity.Name;
import npc.entity.Npc;
import npc.service.NpcService;

@RestController
@Slf4j
public class DefaultNpcGenController implements NpcGenController {

  @Autowired
  private NpcService npcService;

  @Override
  public List<Npc> fetchAllNpcs() {
    return npcService.fetchAllNpcs();
  }

  @Override
  public List<Npc> fetchNpcById(int NpcId) {
    return npcService.fetchNpcById(NpcId);
  }
  
  // POST
    
  @Override
  // switching to int to see if that's my problem
//  public Npc createNpc(Long npcId, Long name, Long species, Long background, Long profession,
//      Long personality) {
  // taking out the npcId to see if the KeyHolder will work to fill it in.
//  public Npc createNpc(Integer npcId, Integer name, Integer species, Integer background, 
//      Integer profession,Integer personality) {
  public Npc createNpc(Integer name, Integer species, Integer background, 
      Integer profession,Integer personality) {
    log.info("name={}, species={}, background={}, profession={}, personality={}", 
        name, species, background, profession, personality);
    return  npcService.createNpc(name, species, background, profession, personality);
  }

  @Override
  public Npc updateNpc(Integer npcId, Integer name, Integer species, Integer background, 
      Integer profession,Integer personality) {
      log.info("npcId={}, name={}, species={}, background={}, profession={}, personality={}", 
          npcId, name, species, background, profession, personality);
      return  npcService.updateNpc(npcId, name, species, background, profession, personality);
  }

  @Override
  public Npc deleteNpc(Integer npcId) {
    // TODO Auto-generated method stub
    return npcService.deleteNpc(npcId);
  }
  
  // Maybe try without the Dto?
//  @Override
//  public Npc createNpc(@Valid NpcDto npcDto) {
//    return npcService.createNpc(npcDto.getName(), npcDto.getSpecies(), 
//        npcDto.getBackground(), npcDto.getProfession(), npcDto.getPersonality());
//  }


//  @Override
//  public Npc updateNpc(@Valid NpcDto npcDto) {
//    return npcService.updateNpc(npcDto.getNpcId(), npcDto.getName(), npcDto.getSpecies(), 
//        npcDto.getBackground(), npcDto.getProfession(), npcDto.getPersonality());
//  }
//
//  @Override
//  public void deleteNpc(@Valid NpcDto npcDto) {
//   log.info("Npc ID deleted = {}", npcDto.getNpcId());
//   npcService.deleteNpc(npcDto.getNpcId());
//  }

}
