package BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        int num = 14;
//        System.out.println(convert2Binary(13));
        System.out.println(numberOfSteps(num));
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
            while(num != 0){
                if((num & 1) == 0){
                    num /= 2;
                    steps++;
                } else {
                    num -= 1;
                    steps++;
                }
            }
            return steps;
        }
    }
