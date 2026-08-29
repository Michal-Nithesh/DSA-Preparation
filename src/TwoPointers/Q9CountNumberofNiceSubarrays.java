package TwoPointers;

public class Q9CountNumberofNiceSubarrays {
    public static void main(String[] args){
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int goal = 2;
        System.out.println(numberOfSubarrays(nums, goal));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public static int atMost(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        while(right < nums.length){
            sum += nums[right] % 2;
            while(sum > goal){
                sum -= nums[left] % 2;
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
}
