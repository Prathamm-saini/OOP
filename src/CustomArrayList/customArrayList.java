package CustomArrayList;

import java.util.Arrays;

public class customArrayList {
    int CAPACITY = 10;
    int[] arr = new int[CAPACITY];
    int size = 0;
    customArrayList() {}

    customArrayList(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        arr = new int[CAPACITY];
    }

    public void add(int value) {
        if (size == CAPACITY) {
            CAPACITY = CAPACITY * 2;
            int[] newArr = new int[CAPACITY];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = value;
    }
    public void remove() {
        if(size == 0){
            return;
        }
        size = size - 1;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) return;

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return arr[index];
    }
    public int size() {
        return size;
    }
    public void printList(){
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
