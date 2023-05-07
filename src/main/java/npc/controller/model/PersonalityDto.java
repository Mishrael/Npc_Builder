package npc.controller.model;

import npc.entity.PersonalityType;

public class PersonalityDto {
  private Long personalityPk;
  private PersonalityType personalityId;
  private String traits;
  private String description;
 
  public Long getPersonalityPk() {
    return personalityPk;
  }
  public PersonalityType getPersonalityId() {
    return personalityId;
  }
  public String getTraits() {
    return traits;
  }
  public String getDescription() {
    return description;
  }
}
