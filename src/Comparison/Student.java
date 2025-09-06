package Comparison;

public class Student implements GenericComparable<Integer>{
    private String name;
    private int age;
    public float marks;

    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    Student(){}

    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.marks = other.marks;

    }

    @Override
    public void displayMarks(Integer value) {
        System.out.println(this.marks);
    }

    @Override
    public int compareTo(Student other) {
        // used as obj.compareTo(student obj2);
        // idea is their diff is >0 means obj is greater else obj 2 which gives negative result;
        return Float.compare(this.marks,other.marks);
    }
    @Override
    public String toString() {
        return name + " " + age + " " + marks;
    }

}
