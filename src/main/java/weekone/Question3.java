package weekone;

import java.util.Arrays;

//	Given	an	array	arr[]	of	n	integers,	construct	a	Product	Array	prod[]	(of	same	size)	such
//	that	prod[i]	is	equal	to	the	product	of	all	the	elements	of	arr[]	except	arr[i].
//	Solve	it	without	division	operator	and	in	O(n).
//	Example	:	arr[]	=	{10,	3,	5,	6,	2}
//	prod[]	=	{180,	600,	360,	300,	900}

public class Question3 {
    static int[] getProductArray(int[] arr, int n){
        int[] output = new int[n];
        if (n==1){
            return arr;
        }
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        leftArr[0] = 1;
        rightArr[n-1] = 1;
        for (int i = 1; i < n; i++) {
            leftArr[i] = leftArr[i-1] * arr[i-1];
        }

        for (int j = n-2; j >= 0; j--) {
            rightArr[j] = rightArr[j+1] * arr[j+1];
        }

        for (int k = 0; k < n; k++) {
            output[k] = leftArr[k] * rightArr[k];
        }

        return output;
    }

    public static void main(String args[]){
        int[] arr = {10, 3, 5, 6, 2};
        System.out.printf("i/o : "+ Arrays.toString(arr));
        System.out.printf("o/p : "+ Arrays.toString(getProductArray(arr, 5)));
    }
}
