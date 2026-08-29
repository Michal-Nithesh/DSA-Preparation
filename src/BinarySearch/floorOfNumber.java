package BinarySearch;

public class floorOfNumber {
    public static void main(String[] args){
        int[] arr = {2, 5, 8, 12, 16};
        int target = 10;
        int ans = floorOfNumber(arr, target);
        System.out.println(ans);
    }
    public static int floorOfNumber(int[] arr, int target){
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
        return arr[right];
    }
}
