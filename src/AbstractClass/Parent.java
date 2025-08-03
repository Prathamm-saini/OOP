package AbstractClass;

// if a class contains one or more than 1 abstract methods it(class) must be declared abstract too
public abstract class Parent{
    // all the child classes of Parent have to override these abstract methods
    int age;

    Parent(){}
    abstract void career();// abstract methods do not have a body
    abstract void partner();

    static void hello(){
        System.out.println("hello");
    }

    /// error -> Parent mom = new Parent;  we cannot create object of abstract class
    /// if we want to create then we will have to override those abstract method with declaring it
    /*Parent dad = new Parent() {
        @Override
        void career() {

        }

        @Override
        void partner() {

        }
    }*/
    // abstract constructors are not allowed as it does not even have a body and if you create constructor it must have a body
    // similarly we cannot create abstract static methods
    // Though we can create static methods in abstract class but not vice versa - no point in creating them as can't be overridden
    // abstract static methods are not allowed
    // final abstract class is also not allowed as it's obvious they need to get extended and overridden by their subclass

}
