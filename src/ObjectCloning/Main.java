package ObjectCloning;

import java.util.Arrays;

public class Main {
    // we can use throw in a function too not only on classes
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Ray = new Human();
        Human Pratham = new Human("Pratham","Saini",21);
        // creating copy of object using copy constructor
        /// Problem in it -> It takes a lot of processing time and run at Runtime
        Human Student = new Human(Pratham);

        // NO overhead and easier, faster
        Human punk = (Human)Pratham.clone();


        // Shallow copying
        /// means it will create a copy of my original object such that new primitives but no objects it will reference to original object only
        /// but create new primitives
        System.out.println(Arrays.toString(Pratham.arr));
        System.out.println(Arrays.toString(punk.arr));

        // Deep copying -> different objects completely


    }
}
