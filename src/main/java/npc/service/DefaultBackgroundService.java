package npc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import npc.dao.BackgroundDao;
import npc.entity.Background;

@Service
public class DefaultBackgroundService implements BackgroundService {

   @Autowired
   private BackgroundDao backgroundDao;
  
  @Override
  public List<Background> fetchAllBackgrounds() {
    List<Background> backgrounds = backgroundDao.fetchAllBackgrounds();
    return backgrounds;
  }

}
