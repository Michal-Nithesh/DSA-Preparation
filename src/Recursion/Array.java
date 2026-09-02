package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args){
//        int[] arr = {2, 4, 3, 8};
//        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length - 1)));
        int[] arr = {10, 20, 30, 20, 40, 20};
        int target = 20;
        List<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndex(arr, target, 0, list));
        System.out.println(findAllIndexWithoutPassList(arr, target, 0));
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
    public static int[] reverseArrayFunctional(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return arr;
        }
        swap(arr, i, arr.length - i - 1);
        return reverseArrayFunctional(arr, i + 1);
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //Array List
    static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    static List<Integer> findAllIndexWithoutPassList(int[] arr, int target, int index){
        List<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        List<Integer> ansFromBelowCalls = findAllIndexWithoutPassList(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        if (target == arr[index]) {
            list.add(index);
        }
        return list;
    }
}
