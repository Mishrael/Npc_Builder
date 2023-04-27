package npc.entity;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Background {
  private Long backgroundPk;
  private String backgroundId;
  private Ethnicity ethnicity;
  private Status status;
  private List<Profession> professions;
}
