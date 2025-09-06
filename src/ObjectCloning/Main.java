package ObjectCloning;

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




    }
}
