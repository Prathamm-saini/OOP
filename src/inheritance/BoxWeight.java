package inheritance;

/*
Super keyword
use case -> when a subclass wants to access properties of super class

Multilevel Inheritance
ex class A super keyword use in super class A will be referring to Object class [NOTE-EVERY CLASS INHERIT OBJECT CLASS (SUPERCLASS OF EVERY CLASS]
     |
   class B super keyword used in this class will be referring to A
     |
   class C super keyword used in this class will be referring to B

super keyword is not necessary while performing inheritance as if you don't write java will call the default constructor of above classes itself
though it is highly required when you want to make custom calls with some arguments
and also in situation where we have similar calls where java may get confused

* */

public class BoxWeight extends Box {
    double weight;
    BoxWeight() {
        super();
        this.weight = -1;
    }
    BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); /// what is this super???
        ///  simply it means call the parent class constructor with 3 arguments
        /// if you see properly length was declared private so how can it not throw error ? coz BoxWeight ain't initializing length, Box is
        this.weight = weight;

        ///  instead of 'this' if you super it will work too , what if you have weight in both Box and BoxWeight?
        ///  in that case it will call weight value of class just above it i-e weight defined in Box so use ' this and super carefully'

    }
    @Override
    public String toString() {
        return super.toString() +" "+ this.weight;
    }



}
