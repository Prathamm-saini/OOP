package Interfaces;

// multiple inheritance via interfaces
public class Car implements Engine,Brake,Media {

    int a = 30;
    // we can have overlapping same name methods in any of these interfaces as they are getting overridden so it does not really matter
    @Override
    public void brake() {
        System.out.println("Braking Car");
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Car");
    }
}
