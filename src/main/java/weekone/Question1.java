package weekone;

import java.util.Arrays;

/*
Given an array of elements, reverse the array
i/o : [l e a r n b a y]
o/p: [y a b n r a e l]
 */
public class Question1 {

    public static void main(String[] args) {
        String[] inputArr = {};
        System.out.printf(" i/o : " + Arrays.toString(inputArr));
        String[] output = reverseArray(inputArr);
        System.out.printf(" o/p : " + Arrays.toString(output));

        String[] inputArr1 = {"l"};
        System.out.printf("\n i/o : " + Arrays.toString(inputArr1));
        String[] output1 = reverseArray(inputArr1);
        System.out.printf(" o/p : " + Arrays.toString(output1));


        String[] inputArr2 = {"l", "e", "a", "r", "n", "b", "a", "y"};
        System.out.printf("\n i/o : " + Arrays.toString(inputArr2));
        String[] output2 = reverseArray(inputArr);
        System.out.printf(" o/p : " + Arrays.toString(output2));
    }

    static String[] reverseArray(String[] arr) {
        if (arr == null) return null;
        if (arr.length == 1) return arr;
        String temp;
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        return arr;
    }
}
