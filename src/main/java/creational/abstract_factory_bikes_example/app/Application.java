package creational.abstract_factory_bikes_example.app;

import creational.abstract_factory_bikes_example.factories.FramesetFactory;
import creational.abstract_factory_bikes_example.forks.Fork;
import creational.abstract_factory_bikes_example.frames.Frame;

public class Application {
    private Fork fork;
    private Frame frame;

    public Application(FramesetFactory framesetFactory) {
        fork = framesetFactory.createFork();
        frame = framesetFactory.createFrame();
    }

    public void ticket() {
        fork.ticket();
        frame.ticket();
    }

}
