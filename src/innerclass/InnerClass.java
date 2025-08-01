// File: InnerClassesTutorial.java

package innerclass;

/*
 * Java Inner Classes Tutorial
 *
 * There are 3 main types of inner classes in Java:
 * 1. Non-static (regular) inner class
 * 2. Static nested class
 * 3. Local inner class (defined inside a method)
 *
 * Use inner classes to logically group classes only used in one place,
 * and to make your code more readable and maintainable.
 * anything declared with static is initialized at compile time as they don't depend on objects and objects are created at compile time
 *
 *
 *
 */

public class InnerClass {

    // 1. Non-static (regular) inner class
    // Requires an instance of the outer class to be created
    class NonStaticInner {
        String message;

        NonStaticInner(String message) {
            this.message = message;
        }

        void showMessage() {
            System.out.println("Non-static inner class: " + message);
        }
    }

    // 2. Static nested class
    // Does not require an instance of the outer class
    static class StaticNested {
        String name;

        StaticNested(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Static nested class: " + name);
        }
    }

    public void demonstrateLocalInnerClass() {
        // 3. Local inner class (defined inside a method)
        // Cannot be static, and is only accessible within this method
        class LocalInner {
            void print() {
                System.out.println("Local inner class: I'm inside a method!");
            }
        }

        LocalInner local = new LocalInner();
        local.print();
    }

    public static void main(String[] args) {
        // Create instance of outer class to use non-static inner class
        InnerClass outer = new InnerClass();
        NonStaticInner nonStatic = outer.new NonStaticInner("Hello from Non-Static");
        nonStatic.showMessage();

        // Create instance of static nested class (no outer needed)
        StaticNested staticNested = new StaticNested("I'm Static");
        staticNested.display();

        // Use method that demonstrates local inner class
        outer.demonstrateLocalInnerClass();
    }
}
