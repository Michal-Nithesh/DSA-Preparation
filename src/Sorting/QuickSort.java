package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 56, 2, 54, 87, 13, 5, 7};
        int[] ans = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] quickSort(int[] arr, int first, int last){
        if(first >= last){ return arr; }
        int pivotIndex = partition(arr, first, last);
        quickSort(arr, first, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, last);
        return arr;
    }
    public static int partition(int[] arr, int first, int last){
        int pivot = arr[first];
        int i = first + 1;
        int j = last;
        while(i <= j){
            while(i <= last && arr[i] <= pivot){
                i++;
            }
            while(j > first && arr[j] >= pivot){
                j--;
            }
            if(i <= j){
                swap(arr, i , j);
            }
        }
        swap(arr, first, j);
        return j;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
