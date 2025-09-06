package CustomList;

public class CustomGenericArrayList<T> {
    /*
    JAVA WILDCARDS
     In Generics, sometimes we don’t know the exact type parameter at compile time.
    Wildcards (?) let us write flexible code while still keeping type-safety.

    1) Unbounded Wildcard ( ? )
       - Means "any type".
       - Example: List<?> list = new ArrayList<String>();
         (list can hold a list of ANY type, but we cannot add new elements except null)

    2) Upper Bounded Wildcard ( ? extends Class )
       - Restricts type to be a subclass (or itself).
       - Example: List<? extends Number>
         → accepts List<Integer>, List<Double>, etc.
       - Useful for "read-only" scenarios, when you want to accept
         data but not insert anything new.

    3) Lower Bounded Wildcard ( ? super Class )
       - Restricts type to be a superclass (or itself).
       - Example: List<? super Integer>
         → accepts List<Integer>, List<Number>, List<Object>.
       - Useful for "write" scenarios (inserting into the list).

    RULE OF THUMB (PECS rule):
    - Producer Extends → use <? extends T> when the collection produces data
    When you say List<? extends Number>, the list can hold Integers, Doubles, Floats… (anything that is a subclass of Number).

BUT: You cannot safely add elements (except null), because the compiler doesn’t know the exact subtype.

    - Consumer Super   → use <? super T> when the collection consumes data
    When you say List<? super Integer>, the list can hold Integer and anything that’s a superclass (Number, Object).

You can add Integers, because every superclass can accept an Integer safely.

BUT: You cannot read with exact type (only Object is guaranteed).
    - If you only need to pass it around → use <?>
     */
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
