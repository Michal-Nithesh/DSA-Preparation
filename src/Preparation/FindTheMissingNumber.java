package Preparation;

import java.util.Arrays;

import static Sorting.FactCount.swap;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};
        int[] b = {1, 2, 3, 4};
        System.out.println(missingNumber(a));
        System.out.println(missingNumber(b));
    }

    public static int missingNumber(int[] arr){
        int index = 0;
        while(index < arr.length){
            int current = arr[index] - 1;
            if(arr[index] < arr.length && arr[index] != arr[current]){
                swap(arr, current, index);
            } else {
                index++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return  arr.length + 1;
    }
}