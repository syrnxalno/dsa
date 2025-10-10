package linkedlist;

// dll - insertion & deletion at both ends
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static Node insertAtHead(Node head, int value) {
        Node temp = new Node(value);
        head.prev = temp;
        temp.next = head;
        return temp;
    }

    public static void insertAtTail(Node head, int value) {
        Node temp = new Node(value);
        while (head.next != null) {
            head = head.next;
        }
        head.next = temp;
        temp.prev = head;
    }

    public static Node deleteAtHead(Node head) {
        if (head == null)
            return null;
        Node newNode = head.next;
        newNode.prev = null;
        return newNode;
    }

    public static Node deleteAtTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;

        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("<-> ");
            }
            temp = temp.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(12);
        Node first = new Node(23);
        Node second = new Node(45);
        head.next = first;
        first.next = second;
        first.prev = head;
        second.prev = first;

        System.out.println("Insertion at both ends:");
        int value = 6;
        head = Node.insertAtHead(head, value);
        Node.insertAtTail(head, value);
        Node.printLinkedList(head);

        System.out.println("\nDeletion at both ends:");
        head = Node.deleteAtHead(head);
        head = Node.deleteAtTail(head);
        Node.printLinkedList(head);
    }
}
