package TwoPointers;

public class Q1LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcda";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        int[] hash = new int[26];
        while(right < s.length()){
            char ch = s.charAt(right);
            if(hash[ch - 'a'] != 0){
                left = hash[ch - 'a'];
            }
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            hash[ch - 'a'] = right + 1;
            right++;
        }
        return maxLen;
    }
}
