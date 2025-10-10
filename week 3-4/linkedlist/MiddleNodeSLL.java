package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // brute force approach
    public static void findMiddleNode(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        int mid = count / 2;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        System.out.println("Middle of the SLL is: " + temp.data);
    }

    // using slow-fast pointers
    public static void middleNode(Node head){
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle of the sll is: "+slow.data);
    }
}

public class MiddleNodeSLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(28);
        head.next.next = new Node(38);
        head.next.next.next = new Node(12);
        Node.middleNode(head);
    }
}
