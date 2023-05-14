package npc.entity;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Background {
  private Integer backgroundPk;
  private BackgroundType backgroundId;
  private List<Profession> professions;
}
