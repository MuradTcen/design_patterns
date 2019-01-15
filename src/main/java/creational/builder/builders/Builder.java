package creational.builder.builders;

import creational.builder.bikes.Type;
import creational.builder.components.GroupSet;
import creational.builder.components.MaterialFrameset;
import creational.builder.components.WheelSet;

public interface Builder {
    void setType(Type type);
    void setMaterialFrameset(MaterialFrameset materialFrameset);
    void setGroupSet(GroupSet groupset);
    void serWheelSet(WheelSet wheelset);
}
