package CustomList;

public class main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2); // removed 3
        list.get(2); // will give 4
        list.printList();

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("Peek");
        list2.add("Pratham");
        list2.add("Saiyam");
        list2.printList();


    }
}

/// Problem in our Custom ArrayList
/// 1. no Generics like ArrayList<Strings> or ArrayList<Integer> which allows list to store multiple type of objects

