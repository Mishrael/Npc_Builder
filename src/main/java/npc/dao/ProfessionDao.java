package npc.dao;

import java.util.List;
import npc.entity.Profession;

public interface ProfessionDao {

  List<Profession> fetchAllProfessions();

}
