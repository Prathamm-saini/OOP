package CustomArrayList;

public class customArrayList {
    private int capacity = 10;
    private int[] arr;
    private int size = 0;

    // Default constructor
    public customArrayList() {
        arr = new int[capacity];
    }

    // Constructor with custom capacity
    public customArrayList(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void add(int value) {
        if (size == capacity) {
            capacity *= 2;
            int[] newArr = new int[capacity];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = value;
    }

    public void remove() {
        if (size == 0) return;
        size--;
        arr[size] = 0; // optional: clear last element
    }

    public void remove(int index) {
        if (index < 0 || index >= size) return;
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; // optional: clear last element
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return arr[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
