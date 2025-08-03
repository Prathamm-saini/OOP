package Interfaces;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting PowerEngine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping PowerEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating PowerEngine");

    }
}
