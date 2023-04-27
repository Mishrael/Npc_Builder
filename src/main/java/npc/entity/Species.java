package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Species {
private Long speciesPk;
private SpeciesType species;
private String description;
}
