package Sorting;

import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args){
        int[] arr = {4,6,2,7,8,5,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] nums) {
        int index = 0;
        while(index < nums.length){
            int current = nums[index] - 1;
            if(nums[index] != nums[current]){
                swap(nums, index, current);
            } else {
                index++;
            }
        }
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}