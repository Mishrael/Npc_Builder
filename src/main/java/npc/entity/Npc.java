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
  private Integer npcId;
  private Integer name;
  private Integer species;
  private Integer background;
  private Integer profession;
  private Integer personality;
  
//  private Long npcId;
//  private Long name;
//  private Long species;
//  private Long background;
//  private Long profession;
//  private Long personality;
  
  @JsonIgnore
  public Integer getNpcId() {
    return npcId;
  }
  
//  @JsonIgnore
//  public Long getNpcId() {
//    return npcId;
//  }
}
