package BinarySearch;

public class ceilingOfNumber {
    public static void main(String[] args){
        int[] nums = {2, 5, 8, 12, 16};
        int target = 10;
        System.out.println(cellingOfNumber(nums, target));
    }
    static int cellingOfNumber(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
