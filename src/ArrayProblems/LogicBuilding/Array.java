package ArrayProblems.LogicBuilding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args){
//        int[] nums = {0,1,0,3,12};
//        System.out.println(Arrays.toString(moveZeroes(nums)));
//        int[] nums = {1,1,2,3,4,5,6};
//        System.out.println(removeDuplicates(nums));
//        int[] nums = {3,0,1,2,5};
//        System.out.println(missingNumber(nums));
        int[] nums1 = {1, 2, 3, 4, 5}, nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }
    public static int[] moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while(right < nums.length){
            if(nums[right] != 0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        return nums;
    }
    public static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int left = 0;
        for(int right = 1; right < nums.length; right++){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1; // Plus 1 Reason: Index starts from 0
    }
    public static int missingNumber(int[] nums) {
        int start = 0;
        while(start < nums.length){
            int idx = nums[start];
            if(nums[start] < nums.length && nums[start] != nums[idx]){
                swap(nums , start, idx);
            } else {
                start++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            set.add(i);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for(int nums: set){
            union[i++] = nums;
        }
        return union;
    }
}
