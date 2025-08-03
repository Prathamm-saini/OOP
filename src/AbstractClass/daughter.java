package AbstractClass;

public class daughter extends Parent {
    daughter(int age){
        this.age = age;
    }
    daughter(){}
    @Override
    void career(){
        System.out.println("I am going to be Doctor");
    }
    @Override
    void partner(){
        System.out.println("Iron-Man");
    }
}
