package Polymorphism;

import java.awt.*;

///  Polymorphism -> Poly + morphism (many ways to represent a single entity)
///
/// types of polymorphism
///
///  1. static polymorphism  (compile time polymorphism)
///    this is achieved via overloading (method overloading)
///    method overloading -> same name of method but types,return, ordering, arguments can be different
/// ex-> multiple constructors
///    A a1 = new A();      A a2 = new A(1,2);
///
///    why is it called compile time polymorphism? -> jvm decides which method or constructor is invoked at compile time
///
///  2. Dynamic Polymorphism(Run time Polymorphism)
///    achieved by method overriding
///   SAME FUNCTION IN BOTH CHILD AND PARENT CLASS and you modify the same method in child class is overriding
///   @Override -> annotation (basically if you want to check whether a method is overridden just put override over it)
///
///  we can prevent overriding using final keyword.
///  it helps jvm to save itself from the overhead at runtime which method to resolve - also called as early binding
///  late binding happens while overriding - search both these online
///
/// if you don't want your class to be inherited put final there
///
/// STATIC
/// one important point if you declare static methods and try to access them while overriding
/// it will always call parent class method only because it is dependent on parent class only (static means common to parent class )
///  no matter with which obj you make a call parent one method is invoked only.
/// you can inherit but you cannot override (static)
///
///
/// Polymorphism doesn't apply to instance variables

public class main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        Square s2 = new Square();


        s1.area(); // there are multiple area methods, but it will see in area method of Shapes (depends on object)
        // same goes for all others
        // this act of using area ( the same thing in every class) differently is Polymorphism

        // confusing part
        Shapes s3 = new Square(); // it is method overriding only
        s3.area(); // here s3 should be referencing to Shapes and is of type Square, so its easy it must have access to properties of Shapes only
        // so here it should print using area method of Shapes? no it doesn't happen
        ///  it prints using area method of square why?
        // see our assumption is correct only, s3 will have access of variables only defined on reference type which shapes here
        // but here it's going to call area of square one coz our base class Square is overriding the parent area()

        // what it's able to  (var/method) is obj able to access is defined by reference
        //  and which to call is decided by object type which is square

        ///  how? UPCASTING
        ///  if obj is referencing to parent class and is of type subclass
        ///  simple rule what variables/methods can object have access of is determined by reference type
        ///  while if both parent and subclass contains same method then which one is called is determined by type of object
        ///  which is SQUARE here so area() method of square is called and also its overriding it to
        ///  This is known as UPCASTING AND THAT'S HOW OVERRIDE WORKS

        ///  how java determines this??
        ///  it discovers this via dynamic method dispatch
        ///  just a way/mechanism by which a call to a method is  resolved at runtime rather compile time
    }
}
