package stack;

import lib.MyStack;

public class SortStack {
    public MyStack sortStackInAscendingOrder(MyStack s){
        MyStack s2 = new MyStack(s.peak());
        while (!s.isEmpty()){
            int temp = s.peak();
            s.pop();
            if(temp >= s2.peak()){
                s2.push(s.peak());
                s.pop();
            }else{
                System.out.printf(" " + temp);
                while (temp >= s2.peak()){
                    System.out.printf(" " + s.peak());
                    s.push(s2.peak());
                    s2.push(temp);
                    s2.pop();
                }
            }
        }
        System.out.printf("\n");
        return s2;
    }

    public String decodeString(){
        return "";
    }

    public static void main(String[] args) {
        SortStack st = new SortStack();
        MyStack s4 = new MyStack(4);
        s4.push(2);
        s4.push(8);
        s4.push(3);
        s4.push(5);
        System.out.printf("i/o - 2, 8, 3, 5 ");
        System.out.printf("o/p - 2, 3, 5, 8 ");
        MyStack p = st.sortStackInAscendingOrder(s4);
        System.out.printf("Sorted Element : ");
        while (!p.isEmpty()){
            System.out.printf(""+ p.peak() + ',');
            p.pop();
        }

    }
}
