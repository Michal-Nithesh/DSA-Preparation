package Patterns;

public class EasyPatterns {
    public static void main(String[] args){
//        RectangularStarPattern(4);
//        RightAngledTrianglePattern(4);
//        RightAngledNumberPyramid(5);
//        RightAngledNumberPyramidII(5);
//        InvertedRightPyramid(5);
//        InvertedNumberedRightPyramid(5);
//        StarPyramid(5);
//        InvertedStarPyramid(5);
//        DiamondStarPatternMethodI(5);
//        DiamondStarPatternMethodII(5);
//        HalfDiamondStarPattern(6);
//        BinaryNumberTrianglePattern(5);
//        NumberCrownPattern(5);
//        IncreasingNumberTrianglePattern(5);
//        IncreasingLetterTrianglePattern(5);
//        ReverseLetterTrianglePattern(5);
//        AlphaRampPattern(5);
        AlphaHillPattern(4);
    }
    static void RectangularStarPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void RightAngledTrianglePattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void RightAngledNumberPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void RightAngledNumberPyramidII(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void InvertedRightPyramid(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void InvertedNumberedRightPyramid(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void StarPyramid(int n){
        for(int i = 0; i < n; i++){
            // This is for Space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            // This is for Star
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void InvertedStarPyramid(int n){
        for(int i = 0; i < n; i++){
            // Print Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print Star
            for(int j = 0; j < 2 * (n - i) - 1; j++){
                System.out.print("*");
            }
            // Print Space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void DiamondStarPatternMethodI(int n){
        StarPyramid(n);
        InvertedStarPyramid(n);
    }
    static void DiamondStarPatternMethodII(int n){
        //First half
        for(int i = 0; i < n; i++){
            // Space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i = 1; i < n; i++){
            // Star
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // Space
            for(int j = 0; j < 2 * (n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void HalfDiamondStarPattern(int n){
        for(int i = 0; i < n; i++){
            // 1st half
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void BinaryNumberTrianglePattern(int n){
        for(int i = 0; i < n; i++){
            // Check how to start
            int start = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
                // To make it 0 and 1
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void NumberCrownPattern(int n){
        int space = 2 * (n - 1);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
    static void IncreasingNumberTrianglePattern(int n){
        int num = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    static void IncreasingLetterTrianglePattern(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    static void ReverseLetterTrianglePattern(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch < 'A' - (i - n); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    static void AlphaRampPattern(int n){
        for(int i = 0; i < n; i++){
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    static void AlphaHillPattern(int n){
        for(int i = 0; i < n; i++){
            //Space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(char ch = 'A'; ch <= 'A' + 2 * i; ch++){
                System.out.print(ch);
            }
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
