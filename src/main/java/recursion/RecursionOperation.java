package recursion;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecursionOperation {

    public  Queue reverseQueue(Queue<Integer> q){
        int data;
        if (!q.isEmpty()){
            data = q.remove();
            reverseQueue(q);
            q.add(data);
        }
        return q;
    }

    public Stack insertAtBottom(Stack<Integer> s, int data){
        int y;
        if (s.isEmpty()){
            s.push(data);
            return s;
        }
        y = s.pop();
        insertAtBottom(s, data);
        s.push(y);

        return s;
    }

    public Stack reverseStack(Stack<Integer> s){
        Stack s2 = s;
        int data;
        if (!s.isEmpty()){
            data = s.pop();
            reverseStack(s);
            insertAtBottom(s, data);
        }
        return s2;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(6);
        RecursionOperation r = new RecursionOperation();
        Queue q2  = r.reverseQueue(q);


        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.printf("Stack "+ s);
        System.out.printf("\n");
        Stack s2 =  r.reverseStack(s);
//        r.insertAtBottom(s, 0);
        System.out.printf("Reverse Stack " + s2);
    }
}
