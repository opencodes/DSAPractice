package LinkedList;

import lib.MultiLevelLinkedList;
import lib.MultiLevelNode;
import lib.MyLinkList;

public class MultiLevelLinkedListOperations {


    public MyLinkList flattenMultiLinkedList(MultiLevelNode head){
        MyLinkList L1 = new MyLinkList();
        MultiLevelNode curr = head;
        System.out.printf(" Multilevel Linked List : ");
        while (curr != null) {
            System.out.printf(" > " + curr.data);
            L1.insertAtLast(curr.data);
            MultiLevelNode currDown = curr.down;
            while (currDown != null) {
                System.out.printf(" - " + currDown.data);
                L1.insertAtLast(currDown.data);

                currDown = currDown.down;
            }
            System.out.printf(" \n");
            curr = curr.right;
        }
        L1.print();
        return L1;
    }

    public void print(MultiLevelNode head) {
        MultiLevelNode curr = head;
        System.out.printf(" Multilevel Linked List : ");
        while (curr != null) {
            System.out.printf(" > " + curr.data);
            MultiLevelNode currDown = curr.down;
            while (currDown != null) {
                System.out.printf(" - " + currDown.data);
                currDown = currDown.down;
            }
            System.out.printf(" \n");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        MultiLevelLinkedList ml = new MultiLevelLinkedList();
        ml.head = new MultiLevelNode(1);
        MultiLevelNode h = ml.head;
        h.down = new MultiLevelNode(2);
        h.down.down = new MultiLevelNode(3);
        h.right = new MultiLevelNode(4);
        h.right.down = new MultiLevelNode(5);
        h.right.down.down = new MultiLevelNode(6);
        h.right.down.down.down = new MultiLevelNode(7);
        h.right.right = new MultiLevelNode(8);
        h.right.right.down = new MultiLevelNode(9);

        ///---
        MultiLevelLinkedListOperations mlop = new MultiLevelLinkedListOperations();
        mlop.print(ml.head);
        mlop.flattenMultiLinkedList(ml.head);
    }
}
