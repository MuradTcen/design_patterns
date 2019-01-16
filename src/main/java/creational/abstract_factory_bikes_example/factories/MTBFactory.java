package creational.abstract_factory_bikes_example.factories;

import creational.abstract_factory_bikes_example.forks.Fork;
import creational.abstract_factory_bikes_example.forks.SuspencsionFork;
import creational.abstract_factory_bikes_example.frames.Frame;
import creational.abstract_factory_bikes_example.frames.MTBFrame;

public class MTBFactory implements FramesetFactory {
    @Override
    public Frame createFrame() {
        return new MTBFrame();
    }

    @Override
    public Fork createFork() {
        return new SuspencsionFork();
    }
}
