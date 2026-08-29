import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Playing {
    public static void main(String[] args) {
//        String strs = "1001";
//        boolean ans = checkOnesSegment(strs);
//        System.out.println(ans);
//        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int twoDistinctChar(String s, int k) {
        int left = 0, right = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if (map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if (map.size() <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }

    public static boolean checkOnesSegment(String s) {
        int right = 0;
        int segment = 1;
        while (right < s.length()) {
            if (right > 0 && s.charAt(right) == '1' && s.charAt(right - 1) == '0') {
                segment++;
            }
            right++;
            if (segment > 1) {
                return false;
            }
        }
        return true;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        for (int i = 0; i < n; i++) {
            array[i * 2] = nums[i];
            array[i * 2 + 1] = nums[i + n];
        }
        return array;
    }

    public static int lengthOfLastWord(String s) {
            int right = s.length() - 1;
            String rev = "";
            int count = 0;

            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }

            while (right >= 0 && s.charAt(right) != ' ') {
                rev += s.charAt(right);
                right--;
            }
            return rev.length();
    }


    // 2-D Array
    static void print2D(int[][] arr){
        // Method - 1
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        //Method - 2
        for(int[] row: arr){
            for(int column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    static void getUserInput(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the number: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] row: arr){
            for(int column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
