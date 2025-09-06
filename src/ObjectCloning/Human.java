package ObjectCloning;
// clonable is an interface which helps us clone objects
///  we must implement it via the class we cant to create copy of objects
public class Human implements Cloneable{
    private String name;
    private String surname;
    private int age;
    int[] arr;
    Human(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5};
    }
    Human(){}

    Human(Human other){
        super();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        // does shallow copying
        return super.clone();
    }

//    @Override
//    public Object clone throws CloneNotSupportedException{
//        ///  this is deep copying
//        ///  just create a new object and copy values directly
//    }
}
