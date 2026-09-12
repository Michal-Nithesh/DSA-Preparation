package TwoPointers;

public class HappyNumber {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));
        while(slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow == 1;
    }
    public static int square(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n = n / 10;
        }
        return sum;
    }
}
