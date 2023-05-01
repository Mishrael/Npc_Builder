package npc.dao;

import npc.entity.Personality;

public interface PersonalityDao {
  Personality fetchRandomPersonality();
}
