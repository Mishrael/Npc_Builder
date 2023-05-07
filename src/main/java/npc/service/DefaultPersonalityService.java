package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import npc.dao.PersonalityDao;
import npc.entity.Personality;

@Service
public class DefaultPersonalityService implements PersonalityService {

  @Autowired
  private PersonalityDao personalityDao;
  
  @Transactional(readOnly = true)
  @Override
  public List<Personality> fetchAllPersonalities() {
    List<Personality> personalities = personalityDao.fetchAllPersonalities();
    return personalities;
  }

}
