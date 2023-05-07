package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.Name;
import npc.service.NameService;

@RestController
public class DefaultNameController implements NameController {

  @Autowired
  private NameService nameService;
  
  @Override
  public List<Name> fetchAllNames() {
    return nameService.fetchAllNames();
  }

}
