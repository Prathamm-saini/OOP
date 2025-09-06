package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/// Vector is ArrayList only but Synchronized
/// as managed by threads so if one thread is working on the object and thread 2 also wants to work then it will be put on wait state
///  it is safer than arraylist but slower
///  only one thread can access the vector at a time while multiple threads can access ArrayList
public class Vector {
    public static void main(String[] args) {
        List<Integer> vector  = new java.util.Vector<>();

       vector.add(1);
       vector.add(2);
       vector.add(3);
        System.out.println(vector);


    }
}
