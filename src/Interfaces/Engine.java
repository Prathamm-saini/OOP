package Interfaces;

public interface Engine {
    final static int PRICE = 76000; // final static is blurred out because it's automatically is final static on creating an interface

    // methods are by default abstract too
    void start();
    void stop();
    void accelerate();
}
