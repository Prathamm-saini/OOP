package LambdaExpression;

import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ///  Implementing Anonymous function using functional interface runnable
        // here it's an anonymous class btw
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        };
        Comparator<Integer> c = (x, y) -> Integer.compare(x, y);
        // Applying lamba expression
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <5; i++) {
            list.add(i);
        }
        list.forEach(item -> System.out.println(item*2));

        ///  Lambda functions
        // sum takes args a and b
        Sum sum = (a,b) -> a+b;

        Operation multiply = (a,b) -> a*b;
        Operation divide= (a,b) -> a/b;
        Operation modulus = (a,b) -> a%b;

        System.out.println(operate(1,2,modulus));

    }
    private static int operate(int a, int b,Operation op) {
        return op.operation(a,b);
    }
}

class anonymous{
    // let's create anonymous nested too
    anonymous an = new anonymous(){
        public void sum(int a,int b){
            System.out.println(a+b);
        }
    };

}