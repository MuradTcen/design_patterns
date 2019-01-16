package creational.abstract_factory_bikes_example;


import creational.abstract_factory_bikes_example.app.Application;
import creational.abstract_factory_bikes_example.factories.FramesetFactory;
import creational.abstract_factory_bikes_example.factories.MTBFactory;
import creational.abstract_factory_bikes_example.factories.RoadFactory;

public class Demo {

    public static Application configureApplication() {
        Application app;
        FramesetFactory framesetFactory;
        String condition = "MTB";
        if (condition.contains("MTB")) {
            framesetFactory = new MTBFactory();
            app = new Application(framesetFactory);
        } else {
            framesetFactory = new RoadFactory();
            app = new Application((framesetFactory));
        }

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.ticket();
    }
}
