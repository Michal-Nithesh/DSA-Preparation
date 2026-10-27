package OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_VALUE = 10;
    private int size = 0;

    public CustomArrayList() {
        data = new int[DEFAULT_VALUE];
    }

    // Add an element to the list
    public void addValue(int num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    // Check if the array is full
    private boolean isFull() {
        return size == data.length;
    }

    // Double the array capacity
    private void reSize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // Remove the last element
    public int remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        return data[--size];
    }

    // Get an element by index
    public int get(int idx) {
        checkIndex(idx);
        return data[idx];
    }

    // Return the number of elements
    public int size() {
        return size;
    }

    // Update an element
    public void set(int idx, int value) {
        checkIndex(idx);
        data[idx] = value;
    }

    // Validate the index
    private void checkIndex(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList {" +
                " data= " + Arrays.toString(data) +
                ", size= " + size +
                '}';
    }


    // Problem: This implementation only supports primitive int values, making it
    // non-reusable for other data types. Generics can make it reusable and provide
    // compile-time type safety.
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();

        CustomArrayList list = new CustomArrayList();

        list.addValue(3);
        list.addValue(6);
        list.addValue(8);

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}