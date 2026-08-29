package Mathametics;

public class PrimNumber {
    public static void main(String[] args){
        System.out.println(method3(29));
    }

    public static boolean method1(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean method2(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i * i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean method3(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2 || num == 3) { return true; }
        if(num % 2 == 0 || (num % 3) == 0) { return false; }
        for(int i = 5; i * i <= num; i = i + 6){
            if(num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
