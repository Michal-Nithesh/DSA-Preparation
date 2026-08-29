package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {-4, 645, 102, 45, 83};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    static int getMaxIndex(int[] arr, int first, int last){
        int max = first;
        for(int i = 0; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
