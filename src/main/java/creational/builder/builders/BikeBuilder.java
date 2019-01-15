package creational.builder.builders;

import creational.builder.bikes.Bike;
import creational.builder.bikes.Type;
import creational.builder.components.GroupSet;
import creational.builder.components.MaterialFrameset;
import creational.builder.components.WheelSet;

public class BikeBuilder implements Builder {

    private Type type;
    private GroupSet groupset;
    private WheelSet wheelSet;
    private MaterialFrameset materialFrameset;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setMaterialFrameset(MaterialFrameset materialFrameset) {
        this.materialFrameset = materialFrameset;
    }

    @Override
    public void setGroupSet(GroupSet groupset) {
        this.groupset = groupset;
    }

    @Override
    public void serWheelSet(WheelSet wheelset) {
        this.wheelSet = wheelset;
    }

    public Bike getResult() {
        return new Bike(type, groupset, wheelSet, materialFrameset);
    }
}
