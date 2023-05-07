package npc.dao;

import java.util.List;
import npc.entity.Personality;

public interface PersonalityDao {

  List<Personality> fetchAllPersonalities();

}
