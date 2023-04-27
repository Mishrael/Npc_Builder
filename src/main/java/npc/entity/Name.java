package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Name {
private Long namePk;
private FirstName firstName;
private Surname surname;
}
