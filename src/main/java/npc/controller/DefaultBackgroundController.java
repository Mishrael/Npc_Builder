package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.Background;
import npc.service.BackgroundService;

@RestController
public class DefaultBackgroundController implements BackgroundController {
  
  @Autowired
  private BackgroundService backgroundService;
  
  @Override
  public List<Background> fetchAllBackgrounds() {
    return backgroundService.fetchAllBackgrounds();
  }

}
