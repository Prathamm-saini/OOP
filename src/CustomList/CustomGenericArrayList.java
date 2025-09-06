package CustomList;

public class CustomGenericArrayList<T> {
    private int capacity = 10;
    private Object[] arr;
    private int size = 0;

    // Default constructor
    public CustomGenericArrayList() {
        arr = new Object[capacity];
        // generics in java is introduced to provide tighter type checks at compile time
        // it's something does this type erasure thing which makes sure no new classes are created at runtime
        // which in turn makes sure we cannot create a generic type array at runtime
        // therefore error in arr = new T[capacity]
        // if you see internal implementation of java - they do it via Object class
    }

    // Constructor with custom capacity
    public CustomGenericArrayList(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    // Add element (resize when full)
    public void add(T value) {
        if (size == capacity) {
            capacity *= 2;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = value;
    }

    // Remove last element
    public void remove() {
        if (size == 0) return;
        size--;
        arr[size] = null; // clear last element (use null instead of 0 since it's generic)
    }

    // Remove element at index
    public void remove(int index) {
        if (index < 0 || index >= size) return;
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null; // clear last element
        size--;
    }

    // Get element at index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return (T) arr[index];  // cast needed because arr is Object[]
    }

    // Return number of elements
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all elements
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
