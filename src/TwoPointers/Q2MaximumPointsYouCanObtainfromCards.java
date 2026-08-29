package TwoPointers;

public class Q2MaximumPointsYouCanObtainfromCards {
    public static void main(String args[]){
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }


    public static int maxScore(int[] cardPoints, int k){
        int leftSum = 0, rightSum = 0, maxSum = 0;
        for(int i = 0; i <= k - 1; i++){
            leftSum += cardPoints[i];
            maxSum = leftSum;
        }
        int rightIndex = cardPoints.length - 1;
        for(int i = k - 1; i >= 0; i--){
            leftSum -= cardPoints[i];
            leftSum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}
