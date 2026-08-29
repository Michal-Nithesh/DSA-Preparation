package TwoPointers;

public class Q8BinarySubarraysWithSum {
    public static void main(String[] args){
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal){
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    public static int atMost(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        while(right < nums.length){
            sum += nums[right];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
}
