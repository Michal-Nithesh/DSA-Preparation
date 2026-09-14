package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args){
//        int[] arr = {1, 2, 3};
//        subset(arr, 0, new ArrayList<>());
//        int[] arr = {1, 2, 1};
//        firstSumSubset(arr, 0, new ArrayList<>(), 0, 2);
//        int[] arr = {1, 2, 1};
//        System.out.println(countSumSubset(arr, 0, 0 , 2));
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static int countSumSubset(int[] arr, int index, int currentSum, int sum) {
        if (index == arr.length) {
            if (currentSum == sum) {
                return 1;
            }
            return 0;
        }
        currentSum += arr[index];
        int left = countSumSubset(arr, index + 1, currentSum, sum);

        currentSum -= arr[index];
        int right = countSumSubset(arr, index + 1, currentSum, sum);
        return left + right;
    }

    // Backtracking Problem's
    public static void subset(int[] arr, int index, ArrayList<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]); // Take
        subset(arr, index + 1, current);

        current.remove(current.size() - 1); // Remove last to don't take
        subset(arr, index + 1, current); // Don't take
    }
    public static void sumSubset(int[] arr, int index, ArrayList<Integer> result, int currentSum, int sum){
        if(index == arr.length){
            if(currentSum == sum) {
                System.out.println(result);
            }
            return;
        }
        result.add(arr[index]);
        currentSum += arr[index];
        sumSubset(arr, index + 1, result, currentSum, sum);

        result.remove(result.size() - 1);
        currentSum -= arr[index];

        sumSubset(arr, index + 1, result, currentSum, sum);
    }
    public static boolean firstSumSubset(int[] arr, int index, ArrayList<Integer> result, int currentSum, int sum){
        if(index == arr.length){
            if(currentSum == sum) {
                System.out.println(result);
                return true;
            }
            return false;
        }
        result.add(arr[index]);
        currentSum += arr[index];
        if(firstSumSubset(arr, index + 1, result, currentSum, sum)){
            return true;
        }

        result.remove(result.size() - 1);
        currentSum -= arr[index];

        if(firstSumSubset(arr, index + 1, result, currentSum, sum)){
            return true;
        }
        return false;
//      return firstSumSubset(arr, index + 1, result, currentSum, sum);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void combination(int[] arr, int target,int index, List<Integer> current, List<List<Integer>> ans){
        if(index == arr.length){
            if(target == 0) {
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(arr[index] <= target){
            current.add(arr[index]);
            combination(arr, target - arr[index], index, current, ans);
            current.remove(current.size() - 1);
        }
        combination(arr, target, index + 1, current, ans);
    }
}
