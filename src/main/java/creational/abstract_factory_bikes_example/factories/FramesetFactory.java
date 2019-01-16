package creational.abstract_factory_bikes_example.factories;

import creational.abstract_factory_bikes_example.forks.Fork;
import creational.abstract_factory_bikes_example.frames.Frame;

public interface FramesetFactory {
    Frame createFrame();
    Fork createFork();
}
