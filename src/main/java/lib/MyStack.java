package lib;

import java.util.Arrays;

public class MyStack {
    int top;
    int[] arr;

    public MyStack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int item) {
        // If stack is not full push element
        if (!this.isFull()) {
            arr[top + 1] = item;
            top++;
        }
        return;
    }

    public int pop() {
//        System.out.printf("TOP " + top + "\n");
        // if stack is not empty
        if (!this.isEmpty()) {
            int curr = arr[top];
            top--;
            return curr;
        }
        return -1;
    }

    public int peak() {
        if (top == -1){
            //System.out.printf("No Element Exist");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length-1;
    }

    public static void main(String args[]){
        MyStack s = new MyStack(3);
        int[] arr = {1, 4, 5, 6, 8, 2, 4, 5, 9, 12};
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        System.out.printf( "Stack: " + Arrays.toString(s.arr) + " Top Index : " + s.top +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.pop() + " Stack: " + Arrays.toString(s.arr) + " Top Index : " + s.top +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.pop() + " Stack: " + Arrays.toString(s.arr) + " Top Index : " + s.top +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.pop() + " Stack: " + Arrays.toString(s.arr) + " Top Index : " + s.top +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.pop() + " Stack: " + Arrays.toString(s.arr) + " Top Index : " + s.top +" Top Element : " + s.peak() +"\n");
    }
}
