package BinarySearch;

public class LinearSearch {
    public static void main(String[] args){
        System.out.println(linearSearchIndex(new int[]{2, 3, 4, 5, 6}, 4));
    }
    public static int linearSearchIndex(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static boolean recursiveLinearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return recursiveLinearSearch(arr, target, index + 1);
    }
}
