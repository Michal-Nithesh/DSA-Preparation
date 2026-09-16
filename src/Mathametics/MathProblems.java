package Mathametics;

import java.util.Arrays;

public class MathProblems {
    public static void main(String[] args){
//        System.out.println(countDigit(473));
//        System.out.println(reverseNumber(536));
//        System.out.println(isPalindrome(104));
//        System.out.println(isArmstrong(153));
        System.out.println(Arrays.toString(divisors(6)));
    }
    public static int countDigit(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    static int reverseNumber(int n){
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n) {
        if(n < 0){
            return false;
        }
        int reverse = reverseNumber(n);
        return reverse == n;
    }
    public static boolean isArmstrong(int n) {
        int get = check(n);
        if(get == n){
            return true;
        }
        return false;
    }
    public static int check(int n){
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static int[] divisors(int n) {
        int count = 0;
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        int[] arr = new int[count];
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}
