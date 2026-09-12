package Recursion;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args){
//        System.out.println(count(3, 3));
//        permutation("", "ABC");
//        printPath("", 3, 3);
//        System.out.println(printPathRet("", 3, 3));
        System.out.println(printDigonal("", 3, 3));
    }

//    Given a string, write a Java program to print all possible permutations of the string.
//    Input: ABC
//    Output:ABC, ACB, BAC, BCA, CAB, CBA
    public static void permutation(String process, String unprocess) {
        if (unprocess.isEmpty()) {
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0, i);
            String second = process.substring(i);
            permutation(first + ch + second, unprocess.substring(1));
        }
    }


    //    Maze Path Counting Problem
//    Given an N × N maze with no blocked cells:
//    ┌───┬───┬───┐
//    │ S │   │   │
//    ├───┼───┼───┤
//    │   │   │   │
//    ├───┼───┼───┤
//    │   │   │ D │
//    └───┴───┴───┘
//    1.S = Start (0,0)
//    2.D = Destination (N-1,N-1)
//    3.Moves = Only D (Down) and R (Right)
//    Count the total number of possible paths from start to destination.
//    Example:
//    Input: N = 3
//    Possible paths: (DDRR, DRDR, DRRD, RDDR, RDRD, RRDD)
//
//    Output: 6
    public static int count(int row, int column){
        if(row == 1 || column == 1){
            return 1;
        }
        int left = count(row - 1, column);
        int rigth = count(row, column - 1);
        return left + rigth;
    }
    public static void printPath(String process, int row, int column){
        if(row == 1 && column == 1){
            System.out.println(process);
            return;
        }
        if(row > 1){
            printPath(process + 'D',row - 1, column);
        }
        if(column> 1) {
            printPath(process + 'R',row, column - 1);
        }
    }
    public static ArrayList<String> printPathRet(String process, int row, int column){
        if(row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(printPathRet(process + 'D',row - 1, column));
        }
        if(column> 1) {
            list.addAll(printPathRet(process + 'R',row, column - 1));
        }
        return list;
    }
    public static ArrayList<String> printDigonal(String process, int row, int column){
        if(row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && column > 1){
            list.addAll(printDigonal(process + 'D', row - 1, column - 1)); // D => Digonal
        }
        if(row > 1){
            list.addAll(printDigonal(process + 'V', row - 1, column)); // V => Vertical
        }
        if(column > 1){
            list.addAll(printDigonal(process + 'H', row, column -1)); // H => Horizontal
        }
        return list;
    }
}
