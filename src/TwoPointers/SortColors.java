package TwoPointers;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int[] test1 = {1,2,0};
        SortColors sol = new SortColors();
        sol.sortColors(test1);
        // Print the sorted array
        for (int num : test1) {
            System.out.print(num + " ");
        }
    }
    public void sortColors(int[] arr) {
        int left = 0, right = arr.length - 1, mid = 0;
        while(mid <= right){
            if(arr[mid] == 0){
                swap(arr, left, mid);
                left++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            } else {
                swap(arr, mid , right);
                right--;
            }
        }
    }
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
