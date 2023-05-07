package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import npc.dao.ProfessionDao;
import npc.entity.Profession;

@Service
public class DefaultProfessionService implements ProfessionService {
  
  @Autowired
  private ProfessionDao professionDao;
  
  @Override
  public List<Profession> fetchAllProfessions() {
    List<Profession> professions = professionDao.fetchAllProfessions();
    return professions;
  }

}
