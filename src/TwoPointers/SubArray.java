package TwoPointers;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args){
//        int[] arr = {1, 2, 4, 6, 8, 9, 14};
//        int target = 21;
//        System.out.println(FindPairTwoPointer(arr, target));
//        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};  // output => 5
//        System.out.println(removeDuplicatesTwoPointer(arr));
//        int[] arr = {1, 0, 2, 0, 4, 0, 5};
//        System.out.println(Arrays.toString(moveAllZerostotheEnd(arr)));
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(ReverseStringInPlace(str)));
    }
    public static boolean FindPairBrute(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean FindPairTwoPointer(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while(left < right) {
            if (arr[left] + arr[right] == target) {
                return true;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static int removeDuplicatesBrute(int[] arr) {
        int[] nums = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < count; j++){
                    if (arr[i] == nums[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    nums[count] = arr[i];
                    count++;
                }
            }
        return count;
    }
    public static int removeDuplicatesTwoPointer(int[] arr) {
        int left = 0, right = 1;
        int count = 0;
        while(right < arr.length){
            if(arr[left] != arr[right]){
                arr[left + 1] = arr[right];
                left++;
                count++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
    public static int[] moveAllZerostotheEnd(int[] arr){
        int left = 0, right = 0;
        while(right < arr.length){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        return arr;
    }
    public static char[] ReverseStringInPlace(char[] str){
        int left = 0, right = str.length - 1;
        while(left <= right){
            int temp = str[left];
            str[left] = str[right];
            str[right] = (char) temp;
            left++;
            right--;
        }
        return str;
    }
    }
