package Hashing.ArrayHashing;

public class StringHashing {
    public static void main(String[] args){
//        String str = "programming";
//        charFrequency(str);
//        String str = "aabbcdde";
//        System.out.println(nonRepeatingChar(str));
//        String s1 = "listen";
//        String s2 = "silent";
//        System.out.println(checkAnagram(s1, s2));
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(str));
    }
    public static void charFrequency(String str){
        int[] freq = new int[26];
        // Pre-Store
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        // Fetching
        // Printing the Frequency Order
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }
        // Printing String Order
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch - 'a'] > 0){
                System.out.println(ch + " -> " + freq[ch - 'a']);
                freq[ch - 'a'] = 0;
            }
        }
    }
    public static char nonRepeatingChar(String str){
        int[] freq = new int[26];
        // Pre-Store
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        // Fetching
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '\0'; // no non-repeating character
    }
    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){ return false; }
        int[] freq = new int[26];
        // Pre-Store
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPangram(String str){
        boolean[] freq = new boolean[26];
        str = str.toLowerCase();
        // Pre-Store
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a'] = true;
            }
        }
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(!freq[i]){
                return false;
            }
        }
        return true;
    }
}
