package LinkedList;

import lib.MyLinkList;
import lib.Node;

public class LinkedListOperations {
    /**
     * Compare two linked list
     *
     * @param l1
     * @param l2
     * @return
     */
    public int CompareTwoLinkedLists(MyLinkList l1, MyLinkList l2) {
        Node curr = l1.head;
        Node curr2 = l2.head;
        while (curr != null) {
            if ((curr.next != null && curr2.next == null) || (curr.next == null && curr2.next != null)) {
                return 0;
            }
            if (curr.data != curr2.data) {
                return 0;
            }
            System.out.printf("Data : " + curr.data + "--" + curr2.data + "\n");
            curr = curr.next;
            curr2 = curr2.next;
        }
        return 1;
    }

    /**
     * Merge two sorted linked list
     *
     * @param h1
     * @param h2
     * @return
     */
    public Node mergeTwoSortedLinkedList(Node h1, Node h2) {
        if (h1 == null || h2 == null) {
            return h1 != null ? h1 : h2;
        }
        Node S, P, Q;
        if (h1.data > h2.data) {
            S = h2;
            P = h1;
            Q = S.next;
        } else {
            S = h1;
            P = S.next;
            Q = h2;
        }
        Node dummyNode = new Node(S.data);
        Node current = dummyNode;
        while (P != null && Q != null) {
            if (P.data > Q.data) {
                S = Q;
                Q = Q.next;
            } else {
                S = P;
                P = P.next;
            }
            current.next = S;
            current = current.next;
        }
        Node remainingNode = (P == null) ? Q : P;
        while (remainingNode != null) {
            current.next = remainingNode;
            current = current.next;
            remainingNode = remainingNode.next;
        }
        return dummyNode;
    }

    /**
     * Remove duplicate from sorted linked list
     *
     * @param head
     * @return
     */
    public Node removeDuplicates(Node head) {
        Node S = head;
        Node P = head.next;
        while (P != null) {
            if (S.data == P.data) {
                P = P.next;
            } else {
                S.next = P;
                S = S.next;
                P = P.next;
            }
        }
        S.next = P;
        return S;
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.printf("Loop Detected \n");
                return true;
            }
        }
        System.out.printf("No Loop Detected \n");

        return false;
    }

    public int lengthOfLoop(Node head){
        Node slow = head;
        Node fast = head;
        int counter = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        slow = slow.next;
        while (slow != fast){
            counter ++;
            slow = slow.next;
        }
        System.out.printf("Length of loop = " + counter + "\n");
        return  counter;
    }

    public MyLinkList addLinkedList(Node h1, Node h2){
        Node p1 = h1;
        Node p2 = h2;
        MyLinkList  L1 = new MyLinkList();
        int reminder = 0;
        int sum = 0;
        while (p1 != null || p2 != null){
            sum = p1 != null ? p1.data + reminder: reminder;
            sum += p2 != null ? p2.data : 0;
            if (sum > 9){
                reminder = sum - 10;
                sum = 1;
            }else {
                reminder = 0;
            }
            L1.insertAtLast(sum);

            if (p1 != null){
                p1 = p1.next;

            }
            if (p2 != null){
                p2 = p2.next;
            }
        }
        L1.print();
        return L1;
    }

    public MyLinkList addLinkedListFromEnd(MyLinkList L1, MyLinkList L2){
        System.out.printf("Reverse L1 \n");
        L1.reverse();
        L1.print();

        System.out.printf("Reverse L2 \n");

        L2.reverse();
        L2.print();
        Node h1 = L1.head;
        Node h2 = L2.head;

        return this.addLinkedList(h1, h2);
    }

    public static void main(String[] args) {
        LinkedListOperations lop = new LinkedListOperations();
        int[] list1 = {1, 9,2,3,4};
        int[] list2 = {1, 2,2,3,4};

        MyLinkList l1 = new MyLinkList();
        for (int i = 0; i < list1.length; i++) {
            l1.insertAtLast(list1[i]);
        }
//        l1.insertAtLast(40);
        MyLinkList l2 = new MyLinkList();
        for (int i = 0; i < list2.length; i++) {
            l2.insertAtLast(list2[i]);
        }
//        l1.print();
//        l2.print();
//        MyLinkList l3 = new MyLinkList();
//        l3.head = lop.mergeTwoSortedLinkedList(l1.head, l2.head);
//        l3.print();
//        lop.removeDuplicates(l2.head);
//        l2.head.next.next.next.next = l2.head;
//      l2.print();
//        lop.hasCycle(l2.head);
//        lop.lengthOfLoop(l2.head);
//        lop.hasCycle(l1.head);
        l1.print();
        l2.print();
//        lop.addLinkedList(l1.head, l2.head);
        lop.addLinkedListFromEnd(l1, l2);
    }
}
