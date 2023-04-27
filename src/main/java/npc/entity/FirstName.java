package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FirstName {
private Long firstNamePK;
private String firstNameId;
private NameOrigin firstNameOrigin;
}
