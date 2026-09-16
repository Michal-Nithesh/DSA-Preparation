package Mathametics;

public class GCD {
    public static void main(String[] args){
        System.out.println(GCDMethodI(12, 18));
        System.out.println(GCDMethodII(12, 18));
        System.out.println(GCDMethodIII(12, 18));
    }
    public static int GCDMethodI(int num1, int num2) {
        int value = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                value = i;
            }
        }
        return value;
    }
    public static int GCDMethodII(int num1, int num2){
        for(int i = Math.min(num1, num2); i > 0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static int GCDMethodIII(int num1, int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 > num2){
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        if(num1 == 0){
            return num2;
        }
        return num1;
    }
}
