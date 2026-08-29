package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 56, 2, 54, 87, 13, 5, 7};
        int[] ans = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr, int first, int last){
        if(first >= last){
            return arr;
        }
        int midIndex = first + (last - first) / 2;
        mergeSort(arr, first, midIndex);
        mergeSort(arr, midIndex + 1, last);
        merge(arr, first, midIndex, last);
        return arr;
    }
    public static void merge(int[] arr, int first, int midIndex, int last){
        int left = first;
        int right = midIndex + 1;
        int[] temp = new int[last - first + 1];
        int index = 0;
        while(left <= midIndex && right <= last){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
                index++;
            } else {
                temp[index] = arr[right];
                right++;
                index++;
            }
        }
        while(left <= midIndex){
            temp[index] = arr[left];
            left++;
            index++;
        }
        while(right <= last){
            temp[index] = arr[right];
            right++;
            index++;
        }
        for(int i = 0; i < temp.length; i++){
            arr[first + i] = temp[i];
        }
    }
}
