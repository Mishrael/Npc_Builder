package npc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import npc.entity.Species;
import npc.service.SpeciesService;

@RestController
public class DefaultSpeciesController implements SpeciesController {

  @Autowired
  private SpeciesService speciesService;
  
  @Override
  public List<Species> fetchAllSpecies() {
    return speciesService.fetchAllSpecies();
  }

}
