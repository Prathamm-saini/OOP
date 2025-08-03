package Interfaces;

public class ourCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public ourCar(Engine engine) {
        this.engine = engine;
    }
    public ourCar(){
        engine = new PowerEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMedia(){
        player.start();
    }
    public void stopMedia(){
        player.stop();
    }

}
