package lib;

public class MyLinkList {
    public Node head;

    public MyLinkList(){
        this.head = null;
    }
    /**
     * Insert At Start of Linked List
     * @param data
     */
    public void insertAtStart(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    /**
     * Insert At Last of Linked List
     * @param data
     */
    public void insertAtLast(int data){
        Node temp = new Node(data);
        Node current = head;
        if (head == null){
            head = temp;
        }else {
            while (current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }

    /**
     * Insert an element with data2 after data
     * @param data
     * @param data2
     */
    public void insertAfter(int data, int data2){
        Node temp = new Node(data2);
        Node current = head;
        while (current.data != data){
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
    }
    public void insertNodeAtPosition(int data, int position){
        Node curr = head;
        Node newNode = new Node(data);
        int i = 0;

        while (i < position){
            curr = curr.next;
            System.out.printf("-" + i + curr.data + " \n");
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    /**
     * Delete a node from start
     */
    public void deleteFromStart(){
        head = head.next;
    }

    public void deleteFromLast(){
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    public void deleteAfter(int data){
        Node current = head;
        while (current.data != data){
            current = current.next;
        }
        current.next = null;
    }
    public void deleteNodeAtPosition(int position){
        Node curr = head;
        int i = 0;
        while (i < position){
            curr = curr.next;
            i++;
        }
        System.out.printf("\n" + curr.data +  " - "+ i+"\n" );
        curr.next = curr.next.next;
    }
    public Node getNodeFromLastPosition(int positionFromLast){
        if (head == null){
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        int counter = positionFromLast-1;

        while (counter != 0 && p2.next != null){
            p2 = p2.next;
            System.out.printf("p2 " + p2.data);
            System.out.printf(" p1 " + p1.data  + "\n");
            counter--;
        }
        System.out.printf("---------------------\n" );
        while (p2.next !=null){
            p1 = p1.next;
            p2 = p2.next;
            System.out.printf("p2 " + p2.data);
            System.out.printf(" p1 " + p1.data  + "\n");
        }
        System.out.printf(positionFromLast +"th element from last is : " + p1.data + "\n");
        return p1;
    }
    /**
     * Print all element
     */
    public void print(){
        Node currentNode = this.head;
        System.out.printf("Print Linked List : ");
        while (currentNode != null){
            System.out.printf(""+currentNode.data+", ");
            currentNode = currentNode.next;
        }
        System.out.printf("\n");
    }

    public void reverse(){
       Node prev = null;
       Node curr = head;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;;
    }

    public boolean isEven(){
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        MyLinkList newLinkedList = new MyLinkList();
        newLinkedList.insertAtLast(10);
        newLinkedList.insertAtLast(20);
        newLinkedList.insertAtLast(30);
        newLinkedList.insertAtLast(40);
        newLinkedList.insertAtLast(50);
        newLinkedList.insertAtLast(60);
        //newLinkedList.insertAtLast(40);
        //newLinkedList.insertAfter(20, 30);
        //newLinkedList.deleteFromLast();
        //newLinkedList.deleteAfter(20);
//        newLinkedList.insertNodeAtPosition(25, 1);
//        newLinkedList.deleteNodeAtPosition(1);
//        newLinkedList.reverse();
        newLinkedList.getNodeFromLastPosition(2);
        newLinkedList.print();
    }
}
