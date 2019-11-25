package weekone;

import java.util.Arrays;

//Given n size unsorted array, find its mean and median.
//Mean of an array = (sum of all elements) /(number of elements)
//Median of a sorted array of size n is defined as below :
//It is middle element when n is odd and average of middle two elements when n is even.
public class Question5 {

    static int getMean(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    static int getMedian(int[] arr) {
        int l = arr.length;
        if (l % 2 == 0) {
            return (arr[l / 2] + arr[(l / 2) - 1]) / 2;
        }
        return arr[l / 2] + arr[(l / 2) - 1];
    }

    public static void main(String args[]) {
        int[] arr = {10, 1};
        int mean = getMean(arr);
        int median = getMedian(arr);
        System.out.printf("i/p: " + Arrays.toString(arr));
        System.out.printf("o/p : mean " + mean + " median " + median);
    }
}
