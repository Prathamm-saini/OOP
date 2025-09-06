package CustomArrayList;

public class main {
    public static void main(String[] args) {
        customArrayList list = new customArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2); // removed 3
        list.get(2); // will give 4
        list.printList();

    }
}
