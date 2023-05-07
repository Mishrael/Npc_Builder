package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.BackgroundProfession;
import npc.service.BackgroundProfessionService;

@RestController
public class DefaultBackgroundProfessionController implements BackgroundProfessionController {
  
  @Autowired
  private BackgroundProfessionService backgroundProfessionService;

  @Override
  public List<BackgroundProfession> fetchAllBackgroundProfessions() {
    return backgroundProfessionService.fetchAllBackgroundProfessions();
  }

}
