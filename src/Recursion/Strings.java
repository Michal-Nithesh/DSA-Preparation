package Recursion;

public class Strings {
    public static void main(String[] args){
//        String str = "hello";
//        System.out.println(reverse(str, str.length() - 1));
//        String str = "madam";
//        System.out.println(isPalindrome(str, 0, str.length() - 1));
//        String str = "aaabbcddd";
//        System.out.println(removeDuplicates(str, 0, ""));
//        String str = "banana";
//        System.out.println(countChar(str, 'a', 0, 0));
        String str = "banana";
        char target = 'a';
        System.out.println(removeChar(str, target, 0, ""));
    }
    static String rev = "";
    public static String reverse(String str, int index){
        if(index < 0){
            return rev;
        }
        char ch = str.charAt(index);
        rev = rev + ch;
        return reverse(str, index - 1);
    }
    static boolean isPalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
    static String removeDuplicates(String str, int index, String remChar){
        if(index > str.length() - 1){
            return remChar;
        }
        char currentChar = str.charAt(index);
        if(index == str.length() - 1 || currentChar != str.charAt(index + 1)){
            remChar += currentChar;
        }
        return removeDuplicates(str, index + 1, remChar);
    }
    static int countChar(String str, char target, int index, int count){
        if(index > str.length() - 1){
            return count;
        }
        if(str.charAt(index) == target){
            count++;
        }
        return countChar(str, target, index + 1, count);
    }
    static String removeChar(String str, char target, int index, String result){
        if(index > str.length() - 1){
            return result;
        }
        if(str.charAt(index) != target){
            result += str.charAt(index);
        }
        return removeChar(str, target, index + 1, result);
    }
}
