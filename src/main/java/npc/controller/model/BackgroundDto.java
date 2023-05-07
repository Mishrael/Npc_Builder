package npc.controller.model;

import java.util.List;
import npc.entity.BackgroundType;
import npc.entity.Profession;

public class BackgroundDto {
  private Long backgroundPk;
  private BackgroundType backgroundId;
  private List<Profession> professions;
  
  public Long getBackgroundPk() {
    return backgroundPk;
  }
  public BackgroundType getBackgroundId() {
    return backgroundId;
  }
  public List<Profession> getProfessions() {
    return professions;
  }
}
