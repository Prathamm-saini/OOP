package Comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Student kai = new Student("Kai", 20, 100f);
        Student tyson = new Student("Tyson", 21, 98f);
        /*
         * Problem statement
         * if(kai>tyson) return true;
         * what will it return? err -> how can be compare objects obviously java will get confused
         * what to compare name, age , marks what?
         *
         * any way ?
         * yes use Comparable interface

         */
        if (kai.compareTo(tyson) > 0) {
            System.out.println("Kai has more marks");
        } else {
            System.out.println("Tyson has more marks");
        }

        Student max = new Student("Max", 21, 99f);
        Student ray = new Student("Ray", 21, 97f);

        Student[] arr = {kai, tyson, max, ray};

        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        // we can run this sort only when we implement comparable interface of java as timsort -> Arrays.sort internally finds that only
        // ofc we can make out own sort method and implement this also. cool !!
        /*
    ===========================
           JAVA COMPARATOR
    ===========================
    - Comparator is a functional interface in java.util.
    - Purpose: define custom ordering for objects externally,
      without changing the class itself.

    Key Points:
    1) Unlike Comparable, which is implemented inside the class
       (natural ordering), Comparator is implemented outside
       (external ordering) and passed to sorting methods like Arrays.sort or Collections.sort.

    2) Method to override:
       int compare(T o1, T o2)
       - returns negative → o1 < o2
       - returns zero     → o1 == o2
       - returns positive → o1 > o2

    3) Useful when:
       - You want multiple ways to sort the same class
       - You cannot modify the class to implement Comparable
       - You need temporary or custom sorting strategies

    4) Modern Java 8+ shortcut (lambda):
       Arrays.sort(arr, (o1, o2) -> Float.compare(o1.marks, o2.marks));

    Example in this code:
       Arrays.sort(arr, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return Float.compare(o1.marks, o2.marks); // sort by marks ascending
           }
       });

    Summary:
       - Comparator = external sorting logic
       - Comparable = internal/natural sorting logic
*/

        Arrays.sort(arr,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.marks,o2.marks);
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}