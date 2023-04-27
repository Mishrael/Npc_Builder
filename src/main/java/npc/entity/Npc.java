package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Npc {
  private Long npcPk;
  private Name name;
  private Species species;
  private Background background;
  private Personality personality;
}
