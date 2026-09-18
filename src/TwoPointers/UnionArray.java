package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionArray {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5}, nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        List<Integer> union = new ArrayList<>();
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                if(union.isEmpty() || union.getLast() != nums1[left]){
                    union.add(nums1[left]);
                }
                left++;
            } else if (nums2[right] < nums1[left]){
                if (union.isEmpty() || union.getLast() != nums2[right]) {
                    union.add(nums2[right]);
                }
                right++;
            } else {
                if(union.isEmpty() || union.getLast() != nums1[left]){
                    union.add(nums1[left]);
                }
                left++;
                right++;
            }
        }
        while(left < nums1.length){
            if(union.isEmpty() || union.getLast() != nums1[left]){
                union.add(nums1[left]);
            }
            left++;
        }
        while(right < nums2.length){
            if(union.isEmpty() || union.getLast() != nums2[right]){
                union.add(nums2[right]);
            }
            right++;
        }
        int[] result = new int[union.size()];
        int i = 0;
        for(int nums: union){
            result[i++] = nums;
        }
        return result;
    }
}
