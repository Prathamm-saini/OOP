package AbstractClass;

public class son extends Parent {
    son(){}
    son(int age){
        this.age = age;
    }
    @Override
    void career(){
        System.out.println("Software Engineer");
    }
    @Override
    void partner(){
        System.out.println("Batman");
    }

}
