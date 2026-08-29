package TwoPointers;

public class MaxScore {
    public static void main(String[] args) {
        int[] arr = {3, 5};
        int k = 2;
        System.out.println(maxScore(arr, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0, maxSum = 0;
        for (int i = 0; i <= k - 1; i++) {
            leftSum += cardPoints[i];
            maxSum = leftSum;
        }
        int rightIndex = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}
