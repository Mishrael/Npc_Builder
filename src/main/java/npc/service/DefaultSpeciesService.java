package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import npc.dao.SpeciesDao;
import npc.entity.Species;

@Service
public class DefaultSpeciesService implements SpeciesService {

  @Autowired
  private SpeciesDao speciesDao;
  
  @Transactional(readOnly = true)
  @Override
  public List<Species> fetchAllSpecies() {
    List<Species> species = speciesDao.fetchAllSpecies();
    return species;
  }

}
