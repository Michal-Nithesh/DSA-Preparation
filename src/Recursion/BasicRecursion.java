package Recursion;

public class BasicRecursion {
    public static void main(String[] args){
//        printNumber(0);
//        int ans = fib(3);
//        System.out.println(ans);
//        int ans = countDigit(5542533);
//        System.out.println(GCD(12, 18));
//        System.out.println(reverseNumber(1242, 0));
        System.out.println(countZeros(02030062, 0));
    }
    static void printNumberBefor(int n){
        if(n == 0){
            return;  // Base Condition
        }
        System.out.println(n);
        printNumberBefor(n - 1); // happens BEFORE recursion
    }
    static void printNumberAfter(int n){
        if(n == 5){
            return;  // Base Condition
        }
        printNumberAfter(n + 1); // Recursive First
        System.out.println(n); // happens AFTER recursion
    }
    static int fib(int n){
        if(n < 2){
            return n; // Base Condition
        }
        return fib(n - 1) + fib(n - 2); // Function Calls
    }
    static int fact(int n){
        if(n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }
    static int countDigit(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
    static int GCD(int a, int b){
        if(a == 0){
            return b;
        }
        return GCD(b % a, a);
    }
    static int reverseNumber(int num, int rev){
        if(num == 0){
            return rev;
        }

        return reverseNumber(num / 10, rev * 10 + num % 10);
    }
    static int countZeros(int num, int count){
        if(num == 0){
            return count;
        }
        int oneDigit = num % 10;
        if(oneDigit == 0){
            count++;
        }
        return countZeros(num / 10, count);
    }
}
