package objectClass;

///  object class is the root for all classes
/// topmost class in inheritance
/// each and every class by default extends object class even if one class is extending one class still internally it extends the object class too
///
///
///  @override finalize() gets called when garbage collection hits
/// @override toString() is used to get string representation
///
/// hashCode
/// gives a number representation with @ -> some internal java representation, you can override it
/// meaning -> unique representation of a number with some algorithm sha256 etc.
/// hash functions are used to create them (Key mod size of hash table) most popular
///
/// .equals() method ->
///
public class object {
    int number;
    float gpa;
    object(){}
    object(int number, float gpa){
        this.number = number;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object);

        Object obj2 = new Object();
        System.out.println(obj2);

        System.out.println(object.hashCode());
        System.out.println(obj2.hashCode());

        object object1 = new object(1,8.2f);
        object object2 = new object(2,9.2f);

        /*now compare both objects
        if(object1>object2){
            System.out.println("object1 is greater than object2");
        }*/
        // this will throw an error -> it will get confused how to compare them both and which one to compare
        System.out.println(object1.equals(object2));
        System.out.println(object2==object1);
        // though both gives same result false but there is a difference
        // == is checking whether these two variables are pointing to same block in heap memory
        // The .equals() method in Java is used to compare two objects for equality based on their content rather than their memory location.
        // Unlike the == operator, which checks if two references point to the same object in memory, the .equals() method checks if the actual values of the objects are the same.


        System.out.println(object1.getClass()); // gets the class
        System.out.println(object2.getClass().getName());

    }
}
