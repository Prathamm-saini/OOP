package Interfaces;

// implementing separate classes for separate interfaces
public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Media Player started");
    }

    @Override
    public void stop() {
        System.out.println("Media Player stopped");
    }
}
