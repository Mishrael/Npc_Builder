package npc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import npc.entity.Npc;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Npc {
  private Long npcId;
  private Long name;
  private Long species;
  private Long background;
  private Long profession;
  private Long personality;
  
  @JsonIgnore
  public Long getNpcId() {
    return npcId;
  }
}
