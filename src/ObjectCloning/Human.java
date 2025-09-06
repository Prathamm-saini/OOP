package ObjectCloning;
// clonable is an interface which helps us clone objects
///  we must implement it via the class we cant to create copy of objects
public class Human implements Cloneable{
    private String name;
    private String surname;
    private int age;

    Human(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    Human(){}

    Human(Human other){
        super();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
