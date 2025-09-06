package ExceptionHandling;

// we have to extends Exception class (necessity)
public class CustomExceptions extends  Exception {
    CustomExceptions() {
        System.out.println("CustomExceptions");
    }
    CustomExceptions(String message) {
        super (message);
    }
}
