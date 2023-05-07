package npc.controller.model;

import npc.entity.SpeciesType;

public class SpeciesDto {
  private Long speciesPk;
  private SpeciesType speciesId;
  private String description;
  
  public Long getSpeciesPk() {
    return speciesPk;
  }
  public SpeciesType getSpeciesId() {
    return speciesId;
  }
  public String getDescription() {
    return description;
  }
  
  
}
