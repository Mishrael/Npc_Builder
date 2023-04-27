package npc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Surname {
  private Long surnamePk;
  private String surnameId;
  private NameOrigin sunameOrigin;
}
