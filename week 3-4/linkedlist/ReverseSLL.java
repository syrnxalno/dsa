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

    // iterative method
    public static Node reverseInPlace(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // recursive method
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head; 
        head.next = null; 
        return newHead;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("-> ");
            }
            temp = temp.next;
        }
    }
}

public class ReverseSLL {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(21);
        head.next.next = new Node(33);
        head.next.next.next = new Node(25);
        // head = Node.reverseInPlace(head);
        head = Node.reverse(head);
        Node.printLinkedList(head);
    }
}