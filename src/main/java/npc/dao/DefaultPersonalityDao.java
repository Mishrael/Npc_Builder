package npc.dao;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Personality;

@Component
@Slf4j
public class DefaultPersonalityDao implements PersonalityDao {

  @Override
  public Personality fetchRandomPersonality() {
    // TODO Auto-generated method stub
    return null;
  }

}
