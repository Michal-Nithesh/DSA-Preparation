package TwoPointers;

public class Q11MinimumWindowSubstring {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s, String t){
        int[] hash = new int[256];
        int startIndex = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;
        for(int i = 0; i < t.length(); i++){
            hash[t.charAt(i)]++;
        }
        while(right < s.length()){
            if(hash[s.charAt(right)] > 0){
                count += 1;
            }
            hash[s.charAt(right)]--;
            while(count == t.length()){
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0){
                    count--;
                }
                left++;
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startIndex, startIndex + minLen);
    }
}
