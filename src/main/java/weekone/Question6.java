package weekone;

import java.util.Arrays;
//Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
//    Examples :
//
//    Input
//    1  2  3
//    4  5  6
//    7  8  9
//
//    Output:
//    3  6  9
//    2  5  8
//    1  4  7
//
//    Input:
//    1  2  3  4
//    5  6  7  8
//    9 10 11 12
//    13 14 15 16
//
//    Output:
//    4  8 12 16
//    3  7 11 15
//    2  6 10 14
//    1  5  9 13
public class Question6 {

    static int[][] rotateMatrix(int [][] arr, int n){
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            }
        }
        return rotatedMatrix;
    }
    public static void main(String args[]) {
        int[][] arr = {{1,2,3}, { 4,5,6}, {7,8,9}};
        System.out.printf("i/p: " + Arrays.toString(arr));
        System.out.printf("o/p :  "+ Arrays.toString(rotateMatrix(arr, 3)) );
    }
}
