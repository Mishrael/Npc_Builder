package npc.dao;

import java.util.List;
import npc.entity.Background;

public interface BackgroundDao {
  List<Background> fetchRandomBackground();
  
}
