package Recursion;

public class Recursion {
    public static void main(String[] args){
//        printNumber(0);
//        int ans = fib(3);
//        System.out.println(ans);
//        int[] arr = {1, 4, 6, 8, 12, 16, 18};
//        int target = 12;
//        int ans = binarySearch(arr, target, 0, arr.length - 1);
//        System.out.println(ans);
        int ans = countDigit(5542533);
        System.out.println(ans);
    }
    static void printNumber(int n){
        if(n == 5){
            return;
        }
        printNumber(n + 1);
        System.out.println(n);
    }
    static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
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
    static int binarySearch(int[] arr, int target, int first, int last){
            int mid = first + (last - first) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                return binarySearch(arr, target, first, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, last);
            }
    }
}
