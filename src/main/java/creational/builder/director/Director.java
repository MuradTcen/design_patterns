package creational.builder.director;

import creational.builder.bikes.Type;
import creational.builder.builders.Builder;
import creational.builder.components.GroupSet;
import creational.builder.components.MaterialFrameset;
import creational.builder.components.WheelSet;

public class Director {

    public void constructRoadEliteBike(Builder builder) {
        builder.setType(Type.ROAD);
        builder.serWheelSet(new WheelSet(1.5f));
        builder.setGroupSet(new GroupSet("Elite", 2, 11));
        builder.setMaterialFrameset(MaterialFrameset.CARBON);
    }

    public void constructMTBCompBike(Builder builder) {
        builder.setType(Type.MTB);
        builder.serWheelSet(new WheelSet(2.2f));
        builder.setGroupSet(new GroupSet("Comp", 3, 9));
        builder.setMaterialFrameset(MaterialFrameset.ALUMINIUM);
    }

    public void constructRoadSingleSpeedBike(Builder builder) {
        builder.setType(Type.ROAD);
        builder.serWheelSet(new WheelSet(1.8f));
        builder.setGroupSet(new GroupSet("SingleSpeed", 1, 1));
        builder.setMaterialFrameset(MaterialFrameset.CHRO_MO);
    }
}
