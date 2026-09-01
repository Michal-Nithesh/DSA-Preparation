package Recursion;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 8};
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length - 1)));
    }
    public static int sumOfArray(int[] arr, int index){
        if(index >= arr.length){
            return 0;
        }
        return arr[index] + sumOfArray(arr, index + 1);
    }
    public static int findMaximum(int[] arr, int index, int max){
        if(index >= arr.length){
            return max;
        }
        return findMaximum(arr, index + 1, Math.max(arr[index], max));
    }
    public static boolean isSorted(int[] arr, int index){
        if (index >= arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }
    public static int[] reverseArray(int[] arr, int left, int right){
        if(left > right){
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return reverseArray(arr, left + 1, right - 1);
    }
}
