package creational.builder;

import creational.builder.bikes.Bike;
import creational.builder.bikes.Manual;
import creational.builder.builders.BikeBuilder;
import creational.builder.builders.BikeManualBuilder;
import creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        BikeBuilder builder = new BikeBuilder();
        director.constructRoadEliteBike(builder);

        Bike bike = builder.getResult();

        System.out.println("Bike built: " + bike.getType());
        System.out.println();
        BikeManualBuilder bikeManualBuilder = new BikeManualBuilder();
        director.constructRoadEliteBike(bikeManualBuilder);
        Manual manual = bikeManualBuilder.getResult();
        System.out.println("Bike's manual: " + manual.print());
    }
}
