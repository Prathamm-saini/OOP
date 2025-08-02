package AcessModifier;

public class A {
    private int num;
    String name;

    public A(int num) {
        this.num = num;
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        int[] arr = new int[num];
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
