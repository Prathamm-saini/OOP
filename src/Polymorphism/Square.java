package Polymorphism;

import java.awt.*;

public class Square extends Shapes {

    // this will run when obj of square is created hence it is overriding the parent method
    // @ annotation of override will check whether this method is being overridden
    // for ex if we write area2 instead of area it will throw an error showing this is not being overridden
    @Override
    void area(){
        System.out.println("side * side");
    }
}
