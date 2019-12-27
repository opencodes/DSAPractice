package lib;

import java.util.Arrays;

public class MyQueue {
    int front;
    int rear;
    int[] arr;

    public MyQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        // If stack is not full push element
        if (!this.isFull()) {
            System.out.printf("Enqueue - " + item + " - " + (arr.length-1) +"\n");
            arr[++rear] = item;
        }
        return;
    }

    public int dequeue() {
        System.out.printf("TOP " + rear + "\n");
        // if stack is not empty
        if (!this.isEmpty()) {
            int curr = arr[rear];
            rear--;
            return curr;
        }
        return -1;
    }

    public int peak(){
        return arr[rear];
    }


    public boolean isEmpty() {
        return rear==0;
    }

    public boolean isFull() {
        return rear == arr.length-1;
    }

    public static void main(String args[]){
        int[] arr = {1, 4, 5, 6, 8, 2, 4, 5, 9, 12};
        MyQueue s = new MyQueue(arr.length);

        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("Enqueue - " + arr[i] +"\n");
            s.enqueue(arr[i]);
        }
        System.out.printf( "Queue: " + Arrays.toString(s.arr) + " Rear : " + s.rear +" Front : " + s.front +"\n");
        System.out.printf( "Pop Element : " + s.dequeue() + " Queue: " + Arrays.toString(s.arr) + " Top Index : " + s.rear +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.dequeue() + " Queue: " + Arrays.toString(s.arr) + " Top Index : " + s.rear +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.dequeue() + " Queue: " + Arrays.toString(s.arr) + " Top Index : " + s.rear +" Top Element : " + s.peak() +"\n");
        System.out.printf( "Pop Element : " + s.dequeue() + " Queue: " + Arrays.toString(s.arr) + " Top Index : " + s.rear +" Top Element : " + s.peak() +"\n");
    }
}
