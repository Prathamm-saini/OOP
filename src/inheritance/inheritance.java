package inheritance;
///  parent (properties -> money,human,traits,values) (Base class)
///    |
///  child
/// in simple terms a child can access properties of parent.Child class is derived from Base class
///
/// child class can access properties of parent class/ base class as well can have their own properties
///
/// we can say child class is inheriting properties of base class
/// always remember base class can't access properties of child class
///
/// we use extend keyword to perform inheritance
/// class parent{                    class child extends parent{
///      float length;                    float weight;
///      float breadth;
///      float width;               }
/// }
///
/// child can access properties like child.length,child.breadth e-t-c
/// whenever we write Child ch = new Child(); and access property for base class we have to initialize those properties in base class too
///
///    Types of Inheritance
///    1. single inheritance -> when one class inherit using extends another class
///                       Box
///                        |
///                      BoxWeight
///    2.Multilevel Inheritance-> one class can inherit another and the another inheriting another
///                      Box
///                       |
///                    BoxWeight
///                       |
///                    BoxPrice
///     3. Multiple Inheritance (not supported in java)
///       when one class extends more than one class
/// A,B,C are classes with A,B -> superclasses and C -> base class
///         A              B
///               |
///               C
///     if both A and B contains same variables or methods jvm will get confused which one to call
///    Therefore it is not supported in java
///
///     whenever you want to use this -> use Interfaces
///
///     4. Hierarchical Inheritance
///       one class is inherited by many classes
///      all rules for single inheritance applies over here
///                   A
///                   |
///            B     C     D
///
///     5. Hybrid Inheritance
///       combination of single and multiple inheritance
///     therefore not in java
///                  A
///                  |
///           B             C
///             |        |
///                  D
///   we will implement this using Interfaces
///
///
///
///
///
///
public class inheritance {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Box has been created "+box); // default constructor is invoked
        Box box2 = new Box(10); // constructor with one arg is invoked
        System.out.println("Box has been created "+box2);
        Box box3 = new Box(box2);
        System.out.println("Box has been created "+box3); // copy constructor is used here


        BoxWeight boxW1 = new BoxWeight(1,2,3,4);
        System.out.println("BoxWeight has been created "+boxW1);

        /// creating a box of type box-weight
        ///  objects type is box-weight, but it is referencing to box (parent)
        Box box5 = new BoxWeight(10,20,20,40);
        // it is actually the type of reference variable which decides what object can access or not
        ///  box5 will go in stack memory and point to box-weight in heap
        System.out.println("BoxWeight has been created "+box5);
        ///System.out.println(box.weight); -> throw an error as weight is a property of box-weight not box


        /// important point -> it is the type of reference variable that determines what property an object can access not the obj type
        /// Therefore Box boc = new BoxWeight(); here obj reference is Box and Object type is BoxWeight

        ///  referencing a child to a parent -> err
        ///  we know there are many variables in both child and parent
        ///  here you are given access to child BoxWeight you can access variables of child i-e weight
        ///  this also means the variables you are trying to access needs to be initialized
        /// but box doesn't have any idea of weight
        ///  happens when you create object of type parent and reference it to child and try to access properties of child via parent


        /// err line ->BoxWeight box6 = new Box(1,2,3);
        /// issue arises coz you are trying to access box class constructor with a weight variable which is obviously not there in box (parent itself)


        BoxWeight box6 = new BoxPrice(100); // this will call
        System.out.println("BoxPrice has been created "+box6);
        System.out.println(box6.weight+" "+box.height+" "+box.width);// see it can access properties of box as well coz it is parent of BoxWeight
        // length is not accessible because we declared it as private
        // vvp -> although when we printed box6 directly we were able to print length
        // reason -> because it was never called by BoxPrice itself, the super keyword makes the class above it call it and hence length width and height were called by box only implicitly

        BoxPrice box7 = new BoxPrice(10000);
        System.out.println("BoxPrice has been created "+box7);



    }
}
