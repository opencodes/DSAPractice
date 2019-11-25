package lib;

public class MyDoubleLinkedList {
    DoubleNode head;

    public MyDoubleLinkedList(){
        this.head = null;
    }
    /**
     * Insert node at start
     * @param data
     */
    public void insertAtStart(int data){
        if (head == null){
            head = new DoubleNode(data);
        }else {
            DoubleNode temp = new DoubleNode(data);
            temp.next = head;
            head = temp;
        }
    }
    /**
     * Insert node at last
     * @param data
     */
    public void insertAtLast(int data){
        if (head == null){
            head = new DoubleNode(data);
        }else {
            DoubleNode curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            DoubleNode temp = new DoubleNode(data);
            temp.prev = curr;
            curr.next = temp;
        }
    }
    /**
     * Insert node after node having data
     * @param data
     * @param data2
     */
    public void insertAfterNode(int data, int data2){
        DoubleNode curr = head;
        while (curr.data != data){
            curr = curr.next;
        }
        DoubleNode newNode = new DoubleNode(data2);
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
    }
    /**
     * Delete from start
     */
    public void deleteFromStart(){
        head = head.next;
        head.prev = null;
    }
    /**
     * Delete from last
     */
    public void deleteFromLast(){
        DoubleNode curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    /**
     * Delete specific node
     * @param data
     */
    public void deleteSpecificNode(int data){
        DoubleNode curr = head;
        while (curr.next.data != data){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
    }
    /**
     * Print linked list in forward direction
     */
    public void printForward(){
        System.out.printf("\n Print Forward  \n");

        DoubleNode curr = head;
        while (curr != null){
            System.out.printf(curr.data + " >> "   );
            curr = curr.next;
        }
    }
    /**
     * Print linked list in backward direction
     */
    public void printBackward(){
        DoubleNode curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        System.out.printf("\n Print Backward \n");
        while (curr != null){
            System.out.printf(curr.data + " >> "   );
            curr = curr.prev;
        }

    }
    public static void main(String[] args) {
        System.out.printf("Output :  \n");
        MyDoubleLinkedList newDoubleLinkList = new MyDoubleLinkedList();
        newDoubleLinkList.insertAtLast(10);
        newDoubleLinkList.insertAtLast(20);
        newDoubleLinkList.insertAtLast(30);
        newDoubleLinkList.insertAfterNode(20, 25);
//        newDoubleLinkList.deleteFromStart();
//        newDoubleLinkList.deleteFromLast();
        newDoubleLinkList.deleteSpecificNode(20);
        newDoubleLinkList.printForward();
        newDoubleLinkList.printBackward();
    }
}
