package packages;

import org.w3c.dom.ls.LSOutput;

public class staticBlock {
    static int a = 10;
    static int b;

    // anything declared as static is executed first even before main
    static{
        System.out.println("I am in Static Block");
        b = a*2;
    }

    public static void main(String[] args) {

        System.out.println(a+" "+b);
    }

}
