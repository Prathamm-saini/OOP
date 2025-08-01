package Polymorphism;

public class Numbers{

    Numbers(){}
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        //constructor overloading example
        Numbers n = new Numbers();
        n.sum(1, 2, 3);
        n.sum(1, 2, 3, 4);
        n.sum(1,2);
    }
}
