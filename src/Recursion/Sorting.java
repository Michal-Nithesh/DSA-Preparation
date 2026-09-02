package Recursion;

import java.util.Arrays;

import static Recursion.Array.swap;

public class Sorting {
    public static void main(String[] args){
//        triangle(1,0, 6);
        int[] arr = { 12, 1, 5, 4, 6, 43, 8};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    // First understand the pattern
    static void triangle(int row, int column, int n){
        if(row == n){
            return;
        }
        if(column < row){
            System.out.print("* ");
            triangle(row, column + 1, n);
        } else {
            System.out.println();
            triangle(row + 1, 0, n);
        }
    }
    
    static void triangleReverse(int row, int column){
        if(row == 0) { return; }
        if(column < row){
            System.out.print("* ");
            triangleReverse(row, column + 1);
        } else {
            System.out.println();
            triangleReverse(row - 1, 0);
        }
    }

    static void bubbleSort(int[] arr, int pass, int index){
        if(pass == 0){
            return;
        }
        if(index < pass){
            if(arr[index] > arr[index + 1]){
                swap(arr, index, index + 1);
            }
            bubbleSort(arr, pass, index + 1);
        } else {
            bubbleSort(arr, pass - 1, 0);
        }
    }
}
