package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args){
//        System.out.println(count(3, 3));
//        permutation("", "ABC");
//        printPath("", 3, 3);
//        System.out.println(printPathRet("", 3, 3));
//        System.out.println(printDigonal("", 3, 3));
//        boolean[][] board = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true},
//        };
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        pathWithRestriction("", board, 0, 0);
//        allPath("", board, 0, 0);
        int[][] pathBoard = new int[board.length][board[0].length];
        printAllPath("", board, 0, 0, pathBoard, 1);
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

    //Maze Path Counting Problem
//    Given an N × N maze with no blocked cells:
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
        int right = count(row, column - 1);
        return left + right;
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
    public static void pathWithRestriction(String process, boolean[][] maze, int row, int column){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(process);
            return;
        }
        if(!maze[row][column]){
            return;
        }
        if(row < maze.length - 1){
            pathWithRestriction(process + 'R', maze, row + 1, column);
        }
        if(column < maze.length - 1){
            pathWithRestriction(process + 'D', maze, row, column + 1);
        }
    }

    // Intro to BackTracking
    public static void allPath(String process, boolean[][] maze, int row, int column){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            System.out.println(process);
            return;
        }
        if(!maze[row][column]){
            return;
        }
        maze[row][column] = false;

        if(row < maze.length - 1){
            allPath(process + 'D', maze, row + 1, column);
        }
        if(column < maze.length - 1){
            allPath(process + 'R', maze, row, column + 1);
        }
        if(row > 0){
            allPath(process + 'U', maze, row - 1, column);
        }
        if(column > 0){
            allPath(process + 'L', maze, row, column - 1);
        }
        maze[row][column] = true;
    }
    public static void printAllPath(String process, boolean[][] maze, int row, int column, int[][] path, int step){
        if(row == maze.length - 1 && column == maze[0].length - 1){
            // Print the path matrix showing the step number
            // at which each cell was visited.
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            // Print the sequence of moves taken
            System.out.println("Path traveling: " + process);
            System.out.println();
            return;
        }
        if(!maze[row][column]){
            return;
        }
        maze[row][column] = false;
        // Add the step no in the path array
        path[row][column] = step;

        if(row < maze.length - 1){
            printAllPath(process + 'D', maze, row + 1, column, path, step + 1);
        }
        if(column < maze.length - 1){
            printAllPath(process + 'R', maze, row, column + 1, path, step + 1);
        }
        if(row > 0){
            printAllPath(process + 'U', maze, row - 1, column, path, step + 1);
        }
        if(column > 0){
            printAllPath(process + 'L', maze, row, column - 1, path, step + 1);
        }
        // Backtracking:
        // Mark the current cell as unvisited so that
        // it can be used in another possible path.
        maze[row][column] = true;

        // Remove the step number while backtracking.
        path[row][column] = 0;
    }
}
