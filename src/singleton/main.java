package singleton;

public class main {
    public static void main(String[] args) {
        singletonClass singleton = singletonClass.getInstance();
        System.out.println(singleton);
        singletonClass singleton2 = singletonClass.getInstance();
        System.out.println(singleton2);

        ///  note we can create as many objects and get instance but every single time same instance is given and objects will point to same instance in memory
        ///  therefore no new object is created in memory all of them points to same instance
    }
}
