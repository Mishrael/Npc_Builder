package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Personality {
private Integer personalityPk;
private PersonalityType personalityId;
private String traits;
private String description;
}
