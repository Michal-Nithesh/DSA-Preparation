package ArrayProblems;

import java.util.*;

public class Array {
    public static void main(String[] args){
        int[] arr = {8, 10, 5, 7, 9, 12};
//        System.out.println(largestElement(arr));
//        System.out.println(secondLargest(arr, arr.length));
//        System.out.println(sortedArray(arr));
//        System.out.println(sortedAndRotated(arr));
//        int[] nums = {1,2,3,4,5,6,7}; int k = 3;
//        rotateMethodI(nums, k);
//        rotateMethodII(nums, k);
//        int[] nums1 = {1, 2, 3, 4, 5}, nums2 = {1, 2, 7};
//        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
//        int[] nums = {10, 5, 2, 7, 1, 9};  int k = 15;
//        System.out.println(longestSubarrayMethodII(nums, k));
//        int[] nums = {3,1,-2,-5,2,-4};
//        System.out.println(Arrays.toString(rearrangeArrayMethodIII(nums)));
//        int[] nums = {2, 3, 5, -2, 7, -4};
//        System.out.println(maxSubArray(nums));
        int num = 28;
        System.out.println(checkPerfectNumber(num));

    }
    public static int largestElement(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int secondLargest(int[] arr, int n) {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        if(n < 2){
            return -1;
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            } else if(arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    public static boolean sortedArray(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static boolean sortedAndRotated(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % nums.length]){
                count++;
            }
        }
        return count <= 1;
    }
    public static void rotateMethodI(int[] nums, int k) {
        k = k % nums.length;
        int start = nums.length - k;
        int[] result = new int[nums.length];
        for(int i = 0; i < k; i++){
            result[i] = nums[start + i];
        }
        for(int i = k; i < nums.length; i++){
            result[i] = nums[i - k];
        }
        System.out.println(Arrays.toString(result));
    }
    public static void rotateMethodII(int[] nums, int k){
        int n = nums.length;
        k = k % nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
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
    public static int longestSubarrayMethodI(int[] nums, int k) {
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    longest = Math.max(longest, j - i + 1);
                }
                if(sum > k){
                    break;
                }
            }
        }
        return longest;
    }
    public static int longestSubarrayMethodII(int[] nums, int k){
        int maxLength = 0; int left = 0; int right = 0; int sum = 0;
        while (right < nums.length){
            sum += nums[right];
            while(left <= right && sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
    public static int[] rearrangeArrayMethodI(int[] nums) {
        int[] result = new int[nums.length];
        int[] posArray = new int[nums.length / 2];
        int[] negArray = new int[nums.length / 2];
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                posArray[index1++] = nums[i];
            } else {
                negArray[index2++] = nums[i];
            }
        }
        for(int i = 0; i < posArray.length; i++){
            result[2 * i] = posArray[i];
            result[2 * i + 1] = negArray[i];
        }
        return result;
    }
    public static int[] rearrangeArrayMethodII(int[] nums) {
        int[] result = new int[nums.length];
        List<Integer> posArray = new ArrayList<>();
        List<Integer> negArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                posArray.add(nums[i]);
            } else {
                negArray.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length / 2; i++){
            result[2 * i] = posArray.get(i);
            result[2 * i + 1] = negArray.get(i);
        }
        return result;
    }
    public static int[] rearrangeArrayMethodIII(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static boolean checkPerfectNumber(int num) {
        int result = getPerfect(num);
        return result == num;
    }
    public static int getPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
