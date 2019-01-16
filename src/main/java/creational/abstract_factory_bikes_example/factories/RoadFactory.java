package creational.abstract_factory_bikes_example.factories;

import creational.abstract_factory_bikes_example.forks.Fork;
import creational.abstract_factory_bikes_example.forks.RigidFork;
import creational.abstract_factory_bikes_example.frames.Frame;
import creational.abstract_factory_bikes_example.frames.RoadFrame;

public class RoadFactory implements FramesetFactory {
    @Override
    public Frame createFrame() {
        return new RoadFrame();
    }

    @Override
    public Fork createFork() {
        return new RigidFork();
    }
}
