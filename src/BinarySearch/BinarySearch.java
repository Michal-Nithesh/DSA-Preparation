package BinarySearch;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 6, 8, 14, 16, 22, 49, 65, 95};
//        int target = 87;
        int[] arr = {2, 4, 5, 5, 5, 8, 10};
        int target = 5;
//        int ans = binarySearch(arr, target);
//        int ans = recursiveBinarySearch(arr, target, 0, arr.length - 1);
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
    static int recursiveBinarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid] < target){
            return recursiveBinarySearch(arr, target, mid + 1, end);
        } else {
            return recursiveBinarySearch(arr, target, start, mid - 1);
        }
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int x = 0; x < nums.length; x++) {
            int ans = binarySearch(nums, x);
            if (ans != -1) {
                int count = nums.length - ans;
                if (ans == count) {
                    return ans;
                }
            }
        }
        return -1;
    }
}