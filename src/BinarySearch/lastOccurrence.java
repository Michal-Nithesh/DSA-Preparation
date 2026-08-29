package BinarySearch;

public class lastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 8, 10};
        int target = 5;
        int ans = lastOccurrence(arr, target);
        System.out.println(ans);
    }
    public static int lastOccurrence(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                ans = mid;
                left = mid + 1;
            } else if(arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
