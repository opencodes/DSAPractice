package weekone;

import java.util.Arrays;

//Find second largest element
public class Question4 {

    static int findSecondLargest(int[] arr, int n){
        int x = 0;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        if(n == 1){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (temp2 < arr[i]){
                temp2 = arr[i];
            }
            if(temp1 < temp2){
                temp3 = temp1;
                temp1 = temp2;
                temp2 = temp3;
            }
        }
        return temp2;
    }
    public static void main(String args[]){
        int[] arr = {10, 1};
        int secondLargestNumber = findSecondLargest(arr, arr.length);
        System.out.printf("i/p: " + Arrays.toString(arr));
        System.out.printf("o/p : "+ secondLargestNumber);
    }
}
