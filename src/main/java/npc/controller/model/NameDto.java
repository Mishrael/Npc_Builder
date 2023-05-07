package npc.controller.model;

import npc.entity.NameOrigin;

public class NameDto {

    private Integer namePk;
    private String nameId;
    private NameOrigin origin;
    
    public Integer getNamePk() {
      return namePk;
    }
    public String getNameId() {
      return nameId;
    }
    public NameOrigin getOrigin() {
      return origin;
    }
    
    
}
