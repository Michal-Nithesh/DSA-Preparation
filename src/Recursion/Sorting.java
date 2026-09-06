package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
//        triangle(1,0, 6);
//        int[] arr = { 12, 1, 5, 4, 6, 43, 8};
//        bubbleSort(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr, arr.length - 1, 0, 0);
//        System.out.println(Arrays.toString(arr));
        int[] arr = {1, 2, 3};
        System.out.println(subsetIterArrayList(arr));
    }
    // First understand the pattern
    static void triangle(int row, int column, int n){
        if(row == n){
            return;
        }
        if(column < row){
            System.out.print("* ");
            triangle(row, column + 1, n);
        } else {
            System.out.println();
            triangle(row + 1, 0, n);
        }
    }
    static void triangleReverse(int row, int column){
        if(row == 0) { return; }
        if(column < row){
            System.out.print("* ");
            triangleReverse(row, column + 1);
        } else {
            System.out.println();
            triangleReverse(row - 1, 0);
        }
    }
    static void bubbleSort(int[] arr, int pass, int index){
        if(pass == 0){
            return;
        }
        if(index < pass){
            if(arr[index] > arr[index + 1]){
                swap(arr, index, index + 1);
            }
            bubbleSort(arr, pass, index + 1);
        } else {
            bubbleSort(arr, pass - 1, 0);
        }
    }
    static void selectionSort(int[] arr, int first, int last, int max){
        if(first == 0){
            return;
        }
        if(last <= first){
            if(arr[last] > arr[max]){
                max = last;
            }
            selectionSort(arr, first, last + 1, max);
        } else {
            swap(arr, first, max);
            selectionSort(arr, first - 1, 0 ,0);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void subsetIter(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    static ArrayList subsetIterArrayList(int[] arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    list.add(arr[k]);
                }
                result.add(list);
            }
        }
        return result;
    }
}
