package Hashing.ArrayHashing;

import java.util.Arrays;

public class NumberHashing {
    public static void main(String[] args){
//        int[] arr = {2, 3, 2, 4, 3, 2, 5};
//        countFrequency(arr);
//        System.out.println(leastFrequentElement(arr));
//        int[] arr = {4, 5, 1, 2, 1, 4, 5};
//        System.out.println(firstElementFrequency1(arr));
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};
        System.out.println(Arrays.toString(findAllDuplicateElements(arr)));
    }
    public static void countFrequency(int[] arr){
        int[] freq = new int[5];

        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        // Fetching
        for(int i = 0; i < freq.length; i++){
            System.out.println(i + " -> " + freq[i]);
        }
    }
    public static int mostFrequentElement(int[] arr){
        int[] freq = new int[6];
        int max = Integer.MIN_VALUE;
        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int element = -1;
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > max){
                max = freq[i];
                element = i;
            }
        }
        return element;

    }
    public static int leastFrequentElement(int[] arr){
        int[] freq = new int[6];
        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        int element = -1;
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && freq[i] < min){
                min = freq[i];
                element = i;
            }
        }
        return element;
    }
    public static int firstElementFrequency1(int[] arr){
        int[] freq = new int[6];
        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 1){
                return i;
            }
        }
        return -1;
    }
    public static int[] findAllDuplicateElements(int[] arr){
        int freq[] = new int[6];
        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int[] removeDup = new int[5];
        int index = 0;
        // Fetching
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                removeDup[index] = i;
                index++;
            }
        }
        return removeDup;
    }
}
