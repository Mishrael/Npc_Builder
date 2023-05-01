package npc.dao;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Species;

@Component
@Slf4j
public class DefaultSpeciesDao implements SpeciesDao {

  @Override
  public Species fetchRandomSpecies() {
    // TODO Auto-generated method stub
    return null;
  }

}
