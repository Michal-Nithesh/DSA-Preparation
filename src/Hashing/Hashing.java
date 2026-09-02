package Hashing;

public class Hashing {
    public static void main(String[] args){
        int[] arr = {2, 3, 2, 4, 3, 2, 5};
//        countFrequency(arr);
        System.out.println(leastFrequentElement(arr));
    }
    public static void countFrequency(int[] arr){
        int[] freq = new int[5];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i = 0; i < freq.length; i++){
            System.out.println(i + " -> " + freq[i]);
        }
    }
    public static int mostFrequentElement(int[] arr){
        int[] freq = new int[6];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int element = -1;
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
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        int element = -1;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && freq[i] < min){
                min = freq[i];
                element = i;
            }
        }
        return element;
    }

}
