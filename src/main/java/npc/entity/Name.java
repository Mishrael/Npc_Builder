package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Name {
private Long namePk;
private String nameId;
private NameOrigin origin;
}
