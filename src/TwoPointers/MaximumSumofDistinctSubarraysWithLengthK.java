package TwoPointers;

import java.util.HashMap;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args){
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        long maxSum = 0;
        long currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right < nums.length){
            currentSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            right++;

            int windowLength = right - left;

            if(windowLength == k) {
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, currentSum);
                }
                if (map.get(nums[left]) == 1) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                }
                currentSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
