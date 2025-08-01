package singleton;

/*/
Problem Statement -> you want to create a class having only one object
ans-> singleton

how to make?
logically we would want them to not use constructor after it is invoked once
 */
public class singletonClass {

    //singletonClass(){} this way we can create as many objects we want as it invoked as many times
    // so make it private
    private singletonClass(){}

    // we want to create a single instance so we will create an instance which will be given to all objects whenever created
    // here we will use a method
    private static singletonClass instance;
    public static singletonClass getInstance(){
        if(instance == null){
            instance = new singletonClass();
        }
        return instance;
    }

}
