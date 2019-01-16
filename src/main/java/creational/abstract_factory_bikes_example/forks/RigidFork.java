package creational.abstract_factory_bikes_example.forks;

public class RigidFork implements Fork{
    @Override
    public void ticket() {
        System.out.println("I'm a rigid fork");
    }
}
