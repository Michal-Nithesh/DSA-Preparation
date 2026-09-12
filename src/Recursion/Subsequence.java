package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args){
//        subsequence("abc", 0, new ArrayList<>());
//        combinationsOfPhoneNumber("", "12");
    }
    public static void subsequent(String process, String unprocess){
        if(unprocess.isEmpty()) {
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        subsequent(process + ch, unprocess.substring(1)); // Take
        subsequent(process, unprocess.substring(1)); // Don't Take
    }
    public static void subsequence(String str, int index, ArrayList<Character> current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Take
        current.add(str.charAt(index));
        subsequence(str, index + 1, current);
        // Undo
        current.remove(current.size() - 1);
        // Don't Take
        subsequence(str, index + 1, current);
    }
    // 17. Letter Combinations of a Phone Number
    public static void combinationsOfPhoneNumber(String process, String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        int digit = unprocess.charAt(0) - '0';
        for(int i = (digit - 1) * 3; i < (digit * 3); i++){
            char ch = (char)('a' + i);
            combinationsOfPhoneNumber(process + ch, unprocess.substring(1));
        }
    }



    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        combinations("", digits, ans);
        return ans;
    }
    public static void combinations(String process, String unprocess, List<String> list){
        if(unprocess.isEmpty()){
            list.add(process);
            return;
        }
        int digit = unprocess.charAt(0) - '0';
        for(int i = (digit - 1) * 3; i < (digit * 3); i++){
            char ch = (char)('a' + i);
            combinations(process + ch, unprocess.substring(1), list);
        }
    }
}
