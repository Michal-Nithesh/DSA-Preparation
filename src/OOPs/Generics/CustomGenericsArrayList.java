package OOPs.Generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {   // <T>  => Temp
    private Object[] data;
    private static final int DEFAULT_VALUE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        data = new Object[DEFAULT_VALUE];
    }

    // Add an element to the list
    public void addValue(T num) {
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
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // Remove the last element
    public T remove() {
        if (size == 0) {
            throw new RuntimeException("List is empty");
        }
        return (T)(data[--size]);
    }

    // Get an element by index
    public T get(int idx) {
        checkIndex(idx);
        return (T)data[idx];
    }

    // Return the number of elements
    public int size() {
        return size;
    }

    // Update an element
    public void set(int idx, T value) {
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

    // This class implements a custom generic ArrayList using a dynamically resizing Object array.
    // It supports adding, removing, retrieving, and updating elements while maintaining type safety
    // through the generic type parameter <T>.
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();

        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();

        list.addValue(3);
        list.addValue(6);
        list.addValue(8);
//        list.addValue("Michal"); Getting an error

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
