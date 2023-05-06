package npc.entity;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Npc {
  private Long npcPk;
  private Name name;
  private Species species;
  private Background background;
  private List<Profession> professions;
  private Personality personality;
}
