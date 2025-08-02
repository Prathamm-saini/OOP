package AcessModifier;

import java.util.ArrayList;
// private means only accessible within a class -> for sensitive data -> access it using getters setters making them public'
// public means you can access it from anywhere
// default access modifier when you don't specify the access modifier -> within the package
// protected ->  within a class, package and a subclass of same package  (inherited class)
// protected is also allowed in subclass of different package -> mostly used when we want to make our methods and variables available in different package only if it's a subclass else It's same as public

///  vvp about protected
/// a subclass can access the property even if declared protected in a different pakcage (such that having super class in different package than itself)
///  but if you try to access the subclass or the superclass own properties using superclass -> it won't allow as superclass have no idea about the child classes so using protected var inside a subclass of different package throws an error with protected
///
public class main {
    public static void main(String[] args) {
        A obj = new A(10,"Prat");
        obj.name = "Glen"; // we are able to access it coz these properties are present in a class which is public and
        //obj.num = 5; similarly if we declare num property as private we won't be able to access it !
        // so does that mean you can't access private properties by any means? no you can use getters and setters function defined inside that class

        // how ? though it's private but getNum setNum etc. are inside the class, and we are accessing the values using them so that's how its accessible
        System.out.println(obj.getNum());
        obj.setNum(100);
        System.out.println(obj.getNum());

        ArrayList<Integer> list = new ArrayList<>();
        // list.DEFAULT_CAPACITY // we won't be able to access it as it's declared private as well final in its definition4


    }
}
