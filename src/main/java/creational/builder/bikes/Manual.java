package creational.builder.bikes;

import creational.builder.components.GroupSet;
import creational.builder.components.MaterialFrameset;
import creational.builder.components.WheelSet;


public class Manual {

    private Type type;
    private GroupSet groupset;
    private WheelSet wheelSet;
    private MaterialFrameset materialFrameset;

    public Manual(Type type, GroupSet groupset, WheelSet wheelset, MaterialFrameset materialFrameset) {
        this.type = type;
        this.groupset = groupset;
        this.wheelSet = wheelset;
        this.materialFrameset = materialFrameset;
    }

    public String print() {
        String info = "";
        info += "Type of bike: " + type + "\n";
        info += "level of groupset: " + groupset.getLevelName() + "; gearings:" + groupset.getCountOfFrontGears() + "x" + groupset.getCountOfRearGears() + "\n";
        info += "Wheelset's weight: " + wheelSet.getWeight() +"\n";
        info += "Material of bike: " + materialFrameset+ "\n";
        return info;
    }
}
