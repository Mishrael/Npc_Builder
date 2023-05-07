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
  public Npc createNpc(@Valid NpcDto npcDto) {
    return npcService.createNpc(npcDto.getName(), npcDto.getSpecies(), 
        npcDto.getBackground(), npcDto.getProfession(), npcDto.getPersonality());
  }


  @Override
  public Npc updateNpc(@Valid NpcDto npcDto) {
    return npcService.updateNpc(npcDto.getNpcId(), npcDto.getName(), npcDto.getSpecies(), 
        npcDto.getBackground(), npcDto.getProfession(), npcDto.getPersonality());
  }

  @Override
  public void deleteNpc(@Valid NpcDto npcDto) {
   log.info("Npc ID deleted = {}", npcDto.getNpcId());
   npcService.deleteNpc(npcDto.getNpcId());
  }

 

  
  

}
