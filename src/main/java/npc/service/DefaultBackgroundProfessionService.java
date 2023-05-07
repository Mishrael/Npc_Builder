package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import npc.dao.BackgroundProfessionDao;
import npc.entity.BackgroundProfession;

@Service
public class DefaultBackgroundProfessionService implements BackgroundProfessionService {
  
  @Autowired
  private BackgroundProfessionDao backgroundProfessionDao;

  @Override
  public List<BackgroundProfession> fetchAllBackgroundProfessions() {
    List<BackgroundProfession> backgroundProfessions = 
        backgroundProfessionDao.fetchAllBackgroundProfessions();
    return backgroundProfessions;
  }

}
