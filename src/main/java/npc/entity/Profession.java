package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profession {
private Long professionPk;
private String professionId;
private MasteryLevel masteryLevel;
}
