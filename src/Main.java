/*
Problem Statement - > create a data structure to store 5 roll no?
sol -> int[] rollNo = new int[5];
can you create a data structure which stores 5 names ?
cool -> String[] names = new String[];

now can you create a data structure to store student's data [name,marks,rollNo]
ahh we can make 3 arrays
int[] rollNo = new int[5];
String[] name  = new String[5];
float[] marks = new float[5];

now lets say we want to store the data of different types in one data structure
here is Classes comes - custom data structure
1. classes are just logical construct / template / blueprint
2. these are named group of properties and functions
3. classes has attribute (variables defined inside classes) , behavior (functions)

classes doesn't exist's for-real , they act as templates/ blueprints for entities existing really
real life example
1.
Car is a class (template) properties -> engine, wheels, price
maruti ferrari audi are objects of class car
here maruti ferrari audi will have properties similar or maybe different, but they follow the same template

1. Human is a class while Patrick, Glenn , Eva are instances of the class human such that objects

* classes helps us in defining these objects

essential characteristics of objects
State -> attributes/ variables defined
Identity -> how objects are different i-e how they are stored in memory
Properties -> functions

Student student1 ; -> this just places student1 in stack
it is not pointing to anything in heap. just null/0/0.0 acc to type of attribute

* To create Objects we use the "new" keyword
new -> this allocates memory dynamically in heap for the object, and it gets instantiated
if we write Student student1 = new Student(); we create a objects of class Student with default constructor
 here student1 is of type Student(which is a class here)


1. Instance variables -> var defined with object is called instance var
[Instance Variable: A variable declared within a class that belongs to an instance (object) of the class]
2. Reference Variable: A variable that holds a reference (or address) to an object in memory; it is always of a non-primitive type (e.g., class, array, interface).
A reference variable can be an instance variable if declared in a class, or a local variable if declared in a method or block, and it can be reassigned to point to different objects
student1 is instance variable here


let's say class -> student , object student1
how do we link the properties defined in class student to the properties value of student 1 ?
ans -> using dot operator

all class object needs to be allocated dynamically
Student student1 = new Student();
Student() is a constructor with no overloading
L.H.S -> execute at compile time(when code is checked before it is run) , R.H.S -> executes at Runtime(file has been compiled,converted to byte code, just being run)
** all primitive and variables are stored in stack memory while non primitives and objects are stored in heap -is a region where dynamically allocated objects are stored in jvm

In Java, we cannot make variables point to any arbitrary memory location as there is no concept of pointers in java

CONSTRUCTOR
It defined what happens when an object is created
Special type of function inside a class
when I write Student stu = new Student(); a default constructor is invoked with no arguments
we can have constructors with any number of arguments
define it using
classname(){}
Student(float marks,String name,int roll){
          this.marks = marks
          this.name = name;
          this.roll = roll
}
internally object will be replaced with this keyword.attribute/instance var
this keyword helps us in binding these arguments to the value being passed when objects is created

CONSTRUCTOR OVERLOADING -> when you pass multiple arguments in constructors so now you have multiple constructors
NO RETURN type for constructors because their primary purpose is to initialize an object, and the return type is implicitly the class type itself.
In Java, a method can return an object of a class type, which means that the method can return an instance of a class. This is useful for encapsulating data and behavior within objects


in java, Primitive data types are not objects . Therefore, they are not created using new keyword
primitives are stored in stack memory

if I write
Student one = new Student();
Student two = one;

ref var one and two stored in stack only and two will point to same memory address in heap memory where one is pointing

*/
//   (first letter capital (convention))
class Student {
    float marks;
    String name;
    int rollNo;

    Student(float marks,String name,int rollNo){
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    void greeting(){
        System.out.println("Hello, my name is "+this.name);
    }
    void changeMarks(float marks){
        this.marks = marks; // this is required to link the object value's being passed
    }

    // when you want your constructor to take values from another constructor use this
    Student(Student others){
        this.marks = others.marks;
        this.name = others.name;
        this.rollNo = others.rollNo;
    }

    Student(){
        // this is how you call a constructor from another constructor
        // also known as constructor chaining
        // use case is simply code efficiency and reusability and a need of single point of initialization
        this(100,"Emma",21);
    }
    @Override
    public String toString(){
        return this.name+" "+this.rollNo+" "+this.marks;
    }
    // run time polymorphism

}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 100;
        student.name = "Patrick";
        student.marks = 200;
        System.out.println(student.marks);
        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student); // return hashcode , we have to override its to.string() method

        // 2nd way
        Student Student2 = new Student(200,"Eva",1);
        System.out.println(Student2); // returns hashcode

        student.greeting(); // prints with name as name is defined as Patrick else it would have printed hello my name is null
        student.changeMarks(87);
        System.out.println(student.marks);

        // usually used when you want one obj to take values from another obj
        Student random = new Student(student);
        System.out.println(random.name); // now random takes values from student obj
        Wrapper num = new Wrapper();
        System.out.println(num);
    }
}

class Wrapper{
    public static void main(String[] args) {
        // wrapper classes - used to create Integer objects which be treated as object only rather than a primitive
        Integer num = 100;
        System.out.println(num);

        int a = 10;
        int b = 20;
        System.out.println(a+" "+b); // a and b will not swap as in functions values are passed by value not reference
        // even though if you use Integer object it won't swap because of final keyword
        // final is just a keyword which makes any variable or function to remain constant i-e non-modifiable
        // one convention final keywords are always initialized
        // when data type is primitive and initialized with final it can't be modified
        // when data type is non-primitive or objects it can be modified i-e value can be modified but the object cannot be reassigned

        final String hero = "Batman";
        //hero ="Superman" -> wrong
        final Student uni_student = new Student();
        uni_student.marks = 900;
        System.out.println(uni_student.marks); // value is modified

        //uni_student = new Student(1,"a",2); wrong cannot be reassigned as uni_student is final

        /* Garbage collector-> automatically happens in java no need to write variable.gc()
        let's say we create A-> class
        A obj;
        for(int i=0;i<1000000;i++){
             obj = new A("random")
        }
        we know no two var points to same memory location in java if they have same value
        a copy is created, and it points to that

        here obj will point to random
        it is removed it again points to random and so on and leftover will be removed by the gc automatically
        */

    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

    }
}