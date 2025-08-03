package Interfaces;
/// Problem statement -> can you solve Multiple Inheritance in Java?
///      class A (having func())                       class B (having func())
///                 Class c extending both A and B
/// This is called multiple inheritance.Here java will get confused which func() to call
///
///
/// solution -> INTERFACES
///  contains abstract functions
///  similar to abstract classes but classes -> BY default must be public, variables are static and final.
///  final because interfaces don't have constructors as they are abstract too
///  Interfaces just tell what the classes are doing not how it's doing
/// we perform dependency injection using interfaces
///
/// Interface is implemented via Implements keyword
/// you can implement multiple interfaces together
///  solves multiple inheritance problem
///
///
/// example for a car
///         interface Brake                  interface Engine (start(),stop(),accelerate())       interface (start() stop())
///   for every car these are going to be different, we 'd have to override them
///   to have a one single class consuming all these we will create an interface
/// interfaces runs at runtime so don't use interfaces in high performance optimization code
public class main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(); // if in all interfaces which one is called happens on runtime ( we already covered in polymorphism what an object can access and which one it will run)

        // Interfaces have no hierarchy like inheritance
        // Therefore two classes which are not related to each other can implements same interfaces


        // can you create type of variable as interface
        Engine car1 = new Car();
        // car1.a; 'a' is defined in car while we know what this object car1 can access is defined by Engine while which it will run is determined by Car
        // so 'a' is not accessible


        Media carMedia = new Car();
        carMedia.start();// problem rather than running Media start() it's running Car start() which is valid
        // but we would not want to start the car when we just want to start the media
        // this happens due to implementation of all interfaces in a single class
        // so make different classes for every interface to run to ensure safe running
        ourCar car5 = new ourCar();
        car5.start();

        car5.startMedia();
    }
}
