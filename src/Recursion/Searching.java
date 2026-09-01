package Recursion;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 12, 16, 18};
        int target = 12;
        int ans = linearSearch(arr, target, 0);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return arr[index];
        }
        return linearSearch(arr, target, index + 1);
    }
    static int binarySearch(int[] arr, int target, int first, int last){
        if(first > last){
            return -1; // Base Condition
        }
        int mid = first + (last - first) / 2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid] > target){
            return binarySearch(arr, target, first, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, last);
        }
    }
}
