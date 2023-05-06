package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Personality {
private Long personalityPk;
private PersonalityType personalityId;
private String traits;
private String description;
}
