package lib;

public class CircularLinkedList {
    private Node tail;
    private CircularLinkedList(){
        this.tail = null;
    }
    private void insert(int data){
        Node  temp = new Node(data);
        if (tail == null){
            tail = temp;
            tail.next = temp;
        }else {
            Node curr = tail;
            while (curr.next != tail){
                curr = curr.next;
            }
            temp.next = tail;
            curr.next = temp;
        }
    }

    private void print(){
        Node curr = tail;
        System.out.printf("Cicular Linked List : ");
        while (curr.next != tail){
            System.out.printf(" "+ curr.data);
            curr= curr.next;
        }
        System.out.printf(" "+ curr.data);
        System.out.printf("; \n");
    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insert(10);
        c.insert(12);
        c.insert(13);
        c.print();
    }
}
