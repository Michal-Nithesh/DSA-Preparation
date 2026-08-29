package TwoPointers;

public class Q6NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args){
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s) {
        int count = 0;
        int[] hash = {-1, -1, -1};
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hash[ch - 'a'] = i;
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                count += Math.min(hash[0], Math.min(hash[1], hash[2])) + 1;
            }
        }
        return count;
    }
}
