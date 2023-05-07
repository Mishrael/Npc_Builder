package npc.dao;

import java.util.List;
import npc.entity.Species;

public interface SpeciesDao {

  List<Species> fetchAllSpecies();

}
