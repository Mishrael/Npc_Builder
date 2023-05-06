package npc.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Npc {
  private Long npcPk;
  private Name name;
  private Species species;
  private Background background;
  private List<Profession> professions;
  private Personality personality;
  
  @JsonIgnore
  public Long getNpcPk() {
    return npcPk;
  }
}
