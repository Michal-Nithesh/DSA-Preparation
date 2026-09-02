package Recursion;

public class String {
    public static void main(String[] args){
        
    }
    public static String reverse(String str, int index){
        String rev = "";
        if(index == str.length()){
            return rev;
        }
        char ch = str.charAt(1);
        rev += ch;
        return reverse(str, index + 1);
    }
}
