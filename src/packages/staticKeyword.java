package packages; // it means inside src go in packages folder
// src is also a folder in IntelliJ which acts as root directory for projects, makes it easier to work with when used with maven or gradle
/*
Problem Statement -> how can we create same class with same name inside a project?
ans-> Packages helps us in doing this
In simple terms it's just a folder
if i write src.com.Prat it means src folder inside src we have "com" folder and inside com we have Prat

it merely helps us to modularize, create containers packaging classes
we can have same file with different objective in different files


Import statement -> used to have some functionality and stuff from another packages or files
just import those if you want to use any functions from them
there is a catch only those function will be available whose access modifier is public

we can import in built packages too like util
import java.util.io; for input output for streams of data incoming

if both files are in same package no need to import
*/

public class staticKeyword {
    public static void main(String[] args) {
        Human Prat = new Human("Pratham",21,1000000,false);
        Human emma = new  Human("Emma",21,1000000,false);

        System.out.println(Prat.population); // this is not recommended
        System.out.println(emma.population);
        // it will return 1 for both which is false as 2 human exists Prat and emma
        // this will now return 2 when declared static in Human class
        // though use Human as it doesn't depend on objects
        System.out.println(Human.population);



        // greeting(); -> error non static right now
        //greeting(); // -> after declared static can be used
        // reason we cannot have a method which static means doesn't need any instance while defining a non-static method inside it -> its hypocrisy
    }
    static void fun(){
        System.out.println("funny");

        // vvp
        // we cannot access non-static stuff inside static without referencing them to a static context

        staticKeyword obj = new staticKeyword();
        obj.greeting(); // accessing greeting which is non-static inside static using context of obj which is static


    }
    void greeting(){
        System.out.println("Hello World");
        fun(); // we can have static method inside non-static method
    }
}
