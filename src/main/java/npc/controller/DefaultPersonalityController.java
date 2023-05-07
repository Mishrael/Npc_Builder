package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.Personality;
import npc.service.PersonalityService;

@RestController
public class DefaultPersonalityController implements PersonalityController {

  @Autowired
  private PersonalityService personalityService;
  
  @Override
  public List<Personality> fetchAllPersonalities() {
    return personalityService.fetchAllPersonalities();
  }

}
