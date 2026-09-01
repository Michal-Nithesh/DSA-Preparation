package TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxValue = 0;
        while(left < right){
            int conHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int water = width * conHeight;
            maxValue = Math.max(maxValue, water);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxValue;
    }
}
