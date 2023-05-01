package npc.dao;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import npc.entity.Name;

@Component
@Slf4j
public class DefaultNameDao implements NameDao {

  @Override
  public Name fetchRandomName() {
    // TODO Auto-generated method stub
    return null;
  }

}
