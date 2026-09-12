package Recursion;

public class SubString {
    public static void main(String[] args){
//        skip("", "bacddacb");
//        System.out.println(skipReturn("bacdacad"));
//        System.out.println(doNotAddApple("bsappledca"));
        System.out.println(skipAppNotApple("bsappledcapp"));
    }
    public static void skip(String process, String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if(ch == 'a'){
            skip(process, unprocess.substring(1));
        } else {
            skip(process + ch, unprocess.substring(1));
        }
    }
    public static String skipReturn(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }
        char ch = unprocess.charAt(0);
        if(ch == 'a'){
            return skipReturn(unprocess.substring(1));
        } else {
            return ch + skipReturn(unprocess.substring(1));
        }
    }
    public static String doNotAddApple(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }
        if(unprocess.startsWith("apple")){
            return doNotAddApple(unprocess.substring(5));
        } else {
            return unprocess.charAt(0) + doNotAddApple(unprocess.substring(1));
        }
    }
    public static String skipAppNotApple(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }
        if(unprocess.startsWith("app") && !unprocess.startsWith("apple")){
            return skipAppNotApple(unprocess.substring(3));
        } else {
            return unprocess.charAt(0) + skipAppNotApple(unprocess.substring(1));
        }
    }
}
