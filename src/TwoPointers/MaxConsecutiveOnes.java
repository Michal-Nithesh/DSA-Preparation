package TwoPointers;

public class MaxConsecutiveOnes {
    static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int left = 0; int right = 0; int maxLen = 0;
        while(right < nums.length){
            if(nums[right] == 1){
                right++;
            } else {
                left = right;
            }
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
