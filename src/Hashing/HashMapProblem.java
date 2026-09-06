package Hashing;

import java.util.HashMap;

public class HashMapProblem {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 1, 2, 1, 4, 3};
        System.out.println(arr);
    }
    public static void frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int nums: arr){
            map.put(nums, map.getOrDefault(nums, 0) + 1);
        }
    }
}
