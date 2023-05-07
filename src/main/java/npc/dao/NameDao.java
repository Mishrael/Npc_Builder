package npc.dao;

import java.util.List;
import npc.entity.Name;

public interface NameDao {

  List<Name> fetchAllNames();

}
