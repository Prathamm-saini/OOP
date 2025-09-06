package ExceptionHandling;
/// Error and Exceptions are two different things.
/// 1.Error is something which is non-recoverable and program cannot handle it
/// 2. Exceptions are something which breaks the flow of program, and we can handle it via programming using exceptions
///
/// In Java, we handle exceptions via throwable class
///               Object class
///                  |
///               Throwable class
///                  |
///    Exceptions (main class to do exception handling)          Errors
///       |
///  Checked   unchecked
///
///
/// checked exceptions  are checked at compile time
/// while unchecked exceptions are checked at runtime (compiler can't check it ex -> divide by zero exception)
///
///
/// try -> put the code you feel may have exception
/// catch -> if exception is caught -> it will handle it
/// finally -> always runs
///
/// if you want to throw some exception rather than running it use -> throw -> explicit throwing.
/// throws -> used to declare exception
/// we can only create finally one time and is optional
public class Main {
    public static void main(String[] args) {
        // exception ->System.out.println(a/b);
        try{
            int x = divide(10,0);
            System.out.println(x);
            String name  = "Ray";
            if(name.equals("Ray")){
                throw new CustomExceptions("Name is Ray");
            }
        }catch(CustomExceptions e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){ // we can have Exception e also here -> signifies exception is here we don't know what type is it
            System.out.println(e.getMessage());
            // we can have multiple catch block to check many exceptions
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        /// here is a catch -> if Exception is put above the below catch statement won't execute
        /// reason -> ofc if we put it above it's like check for any kind of exceptions if present
        /// this makes it obvious all type of exceptions is handled and no need to go downwards
        ///  so use Exception last
        finally {
            System.out.println("Done");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        // it's like using divide it may throws an exception for -> throws
        // whenever you throw and exception use throws -> implicitly throwing an exception
        if(b==0){
            throw  new ArithmeticException("Do not Division by zero");
        }
        return a/b;
    }
}
