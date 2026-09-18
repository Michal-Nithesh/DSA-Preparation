package TwoPointers;

public class Q1LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcdabss";
        System.out.println(lengthOfLongestSubstringBruteForce(s));
    }

    public static int lengthOfLongestSubstringBruteForce(String s){
        int maxLength = 0;
        boolean[] seen = new boolean[256];
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
               if(seen[ch]){
                    break;
               }
                seen[ch] = true;
               int len = j - i + 1;
               maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int left = 0, right = 0, maxLen = 0;
//        int[] hash = new int[26];
//        while(right < s.length()){
//            char ch = s.charAt(right);
//            if(hash[ch - 'a'] != 0){
//                left = hash[ch - 'a'];
//            }
//            int len = right - left + 1;
//            maxLen = Math.max(maxLen, len);
//            hash[ch - 'a'] = right + 1;
//            right++;
//        }
//        return maxLen;
//    }
public static int lengthOfLongestSubstring(String s) {
    int[] hash = new int[256];
    // Arrays.fill(hash, -1);
    int left = 0, right = 0, maxLength = 0;
    while(right < s.length()){
        char ch = s.charAt(right);
        if(hash[ch] > left){
            left = hash[ch];
        }
        int len = right - left + 1;
        maxLength = Math.max(maxLength, len);
        hash[ch] = right + 1;
        right++;
    }
    return maxLength;
}
}
