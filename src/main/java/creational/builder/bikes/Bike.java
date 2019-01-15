package creational.builder.bikes;

import creational.builder.components.GroupSet;
import creational.builder.components.MaterialFrameset;
import creational.builder.components.WheelSet;

import java.security.acl.Group;

public class Bike {

    private Type type;
    private GroupSet groupset;
    private WheelSet wheelSet;
    private MaterialFrameset materialFrameset;

    public Bike(Type type, GroupSet groupset, WheelSet wheelset, MaterialFrameset materialFrameset) {
        this.type = type;
        this.groupset = groupset;
        this.wheelSet = wheelset;
        this.materialFrameset = materialFrameset;
    }

    public Type getType() {
        return type;
    }

    public GroupSet groupSet() {
        return groupset;
    }

    public WheelSet wheelSet() {
        return wheelSet;
    }

    public MaterialFrameset getMaterialFrameset() {
        return materialFrameset;
    }
}
