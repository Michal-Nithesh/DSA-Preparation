package Sorting;

import java.util.*;

public class FactCount {
        // answer will be {5, 7, 6, 10, 8, 12}
        public static void main(String args[]){
            int[] arr = {9, 4, 15, 2, 16, 3};
            for(int i = 0; i < arr.length - 1; i++){
                for(int j = 0; j < arr.length - i - 1; j++){
                    int fistFactor = countFact(arr[j]);
                    int seccondFactor = countFact(arr[j + 1]);
                    if(countFact(arr[j]) > countFact(arr[j + 1]) || (fistFactor == seccondFactor && arr[j] > arr[j + 1])){
                        swap(arr, j, j + 1);
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        public static int countFact(int num){
            int count = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            return count;
        }
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }


// 12 => 6
// 7  => 2
// 10 => 4
// 6  => 4
// 5  => 2
// 8  => 4
