package packages;

/*
Static keyword
what if there is some sort of property which is common to all Human(class)?
ans-> any facts
Population is always going to be same for all humans (common to all objects value is not  logically related to object)

such properties are called Static

if we declare something as static we can access them without creating objects of that class

we can create both methods and variables as static

why main is declared static ?
because we do not wish to create object of main and access it via that as it will be cumbersome

inside a static method we cannot use something which is non-static
ex- in main func which is static we cannot use function which are not static
because main func won't have an instance while the method greeting will have one


 */
public class Human{
    String name;
    int age;
    float salary;
    boolean married;
    static long population;
    // population property is common to all humans therefore static
    // it needs to increment whenever a new Human is created

    Human(String name,int age,float salary,boolean married){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
        //this.population +=1; if it is common to all Human and not related to objects rather than using this use Human
        Human.population++;
    }

}

