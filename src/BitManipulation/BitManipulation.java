package BitManipulation;

import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        int num = 14;
//        System.out.println(convert2Binary(13));
//        System.out.println(numberOfSteps(num));
//        System.out.println(Arrays.toString(swap(10, 20)));
//        System.out.println(ithBitSetorClear(10, 1));
//        System.out.println(setTheithBit(10, 1));
        System.out.println(minBitsToFlip(10, 20));

    }

    public static String convert2Binary(int x) {
        String result = "";
        int n = x;
        while (x > 0) {
            if ((x & 1) == 1) { // (x % 2 == 0)
                result += '1';
            } else {
                result += '0';
            }
//            x = x / 2;
            x = x >> 1;
        }
        return new StringBuilder(result).reverse().toString();
    }

    static class convert2Decimal {
        public static int Method1(String s) {
            int last = s.length();
            int p2 = 1, num = 0;
            for (int i = last - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    num += p2;
                }
                p2 *= 2;
            }
            return num;
        }

        public static int Method2(String s) {
            int num = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    num += (1 << (s.length() - 1 - i));
                }
            }
            return num;
        }
    }

    static int[] swap(int first, int second){
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        return new int[]{first, second};
    }
    
    static int ithBitSetOrClear(int num, int i){
        return (num & (1 << i)) == 0 ? 0 : 1;
    }

    static int setTheithBit(int num, int i) {
        return num | (1 << i);
    }

    static int clearTheithBit(int num, int i) {
        return num & ~(1 << i);
    }

    static int toggleithBit(int num, int i){
        return num ^ (1 << i);
    }

    static int removeLastSetBit(int num){
        return num & (num - 1);
    }

    static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            // if((n & 1) == 1){
            count++;
            // }
            // n = n >> 1;
            n = n & (n - 1);
        }
        return count;
    }

    static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num /= 2;
                steps++;
            } else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }

    static boolean numberPowerOf2(int num){
        return (num & (num - 1)) == 0; // A power of 2 has exactly one 1 bit in its binary representation.
    }
    
    static int minBitsToFlip(int start, int goal){
        int XOR = start ^ goal;   // Give two numbers different bits
        int count = 0;
        while(XOR != 0){
            count++;
            XOR = XOR & (XOR - 1);
        }
        return count;
    }


    // Power Set(Print All subsets)
    static List<List<Integer>> powerSet(int[] nums, int n){
        int subsetNo = 1 << n;
        List<List<Integer>> result = new ArrayList<>();
        for(int mask = 0; mask < subsetNo; mask++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((mask & (1 << i)) != 0){
                    list.add(nums[i]);
                }
            }
            result.add(list);
        }
        return result;
    }



    // Single number - |
    // Single Number - ||
}
