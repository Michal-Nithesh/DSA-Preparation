package TwoPointers;

public class Q3MaxConsecutiveOnesIII {
    public static void main(String args[]){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxLen = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeros++;
            }
            if(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
