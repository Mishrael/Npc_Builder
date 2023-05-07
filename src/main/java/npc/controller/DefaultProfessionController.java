package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.Profession;
import npc.service.ProfessionService;

@RestController
public class DefaultProfessionController implements ProfessionController {

  @Autowired
  private ProfessionService professionService;
  
  @Override
  public List<Profession> fetchAllProfessions() {
    return professionService.fetchAllProfessions();
  }

}
