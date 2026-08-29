package TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class Q5LongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        // Test Case 1
//        String s = "aaabbccd";
//        int k = 2;
//        System.out.println("Output: " + longestSubstring(s, k));

        // Test Case 2
        String s = "eceba";
        int k = 2;
        System.out.println("Output: " + longestSubstring(s, k));

        // Test Case 3
//        s = "aabbcc";
//        k = 1;
//        System.out.println("Output: " + longestSubstring(s, k));
    }
    public static int longestSubstring(String s, int k) {
        int left = 0, right = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if(map.size() > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
            }
            if(map.size() <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}


//Input: aaabbccd, k = 2
//Output: 5
//
//Input: eceba, k = 2
//Output: 3
//
//Input: aabbcc, k = 1
//Output: 2
