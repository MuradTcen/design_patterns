package creational.abstract_factory_bikes_example.frames;

public class MTBFrame implements Frame{
    @Override
    public void ticket() {
        System.out.println("I'm a MTB frame");
    }
}
