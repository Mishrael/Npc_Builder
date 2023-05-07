package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import npc.dao.NameDao;
import npc.entity.Name;

@Service
public class DefaultNameService implements NameService {

  @Autowired
  private NameDao nameDao;
  
  @Transactional(readOnly = true)
  @Override
  public List<Name> fetchAllNames() {
    List<Name> names = nameDao.fetchAllNames();
    return names;
  }

}
