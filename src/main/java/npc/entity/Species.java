package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Species {
private Integer speciesPk;
private SpeciesType speciesId;
private String description;
}
