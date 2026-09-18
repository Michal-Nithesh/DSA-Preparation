package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(insertNormal(nums, nums.length)));
        System.out.println(Arrays.toString(insertRecursive(nums, 0, nums.length)));
    }
    public static int[] insertNormal(int[] nums, int n){
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
    public static int[] insertRecursive(int[] arr, int i, int n){
        if(i == n){
            return arr;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        return insertRecursive(arr, i + 1, n);
    }
}
