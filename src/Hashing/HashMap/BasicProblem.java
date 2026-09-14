package Hashing.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicProblem {
    public static void main(String[] args){
        int[] nums = {1, 2, 2, 1, 3, 1, 2, 2, 3, 0};
        List<List<Integer>> value = countFrequencies(nums);
        System.out.println(value);
    }

    // Counting Frequencies of Array Elements
//    public static List<List<Integer>> countFrequencies(int[] nums) {
//        int[] freq = new int[4];
//        List<List<Integer>> result = new ArrayList<>();
//        // Pre-Store
//        for(int i = 0; i < nums.length; i++){
//            freq[nums[i]]++;
//        }
//        // Fetching
//        for(int i = 0; i < freq.length; i++){
//            List<Integer> list = new ArrayList<>();
//            list.add(i);
//            list.add(freq[i]);
//            result.add(list);
//        }
//        return result;
//    }
    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        // Pre-Store
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // Fetching
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            List<Integer> values = new ArrayList<>();
            values.add(entry.getKey());
            values.add(entry.getValue());
            result.add(values);
        }
        return result;
    }
}
