package linkedlist;

// singly linked list - insertion & deletion at both ends, traversal
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

    public static Node insertAtHead(Node head, int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
        }
        n.next = head;
        return n;
    }

    public static void insertAtTail(Node head, int value) {
        Node temp = head;
        Node tail = new Node(value);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tail;
    }

    public static Node deleteAtHead(Node head) {
        if (head == null) {
            return null;
        }
        Node newNode = null;
        newNode = head.next;
        return newNode;
    }

    public static Node deleteAtTail(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node createLinkedListFromArray(int arr[]) {
        Node head = null;
        Node temp = null;
        for (int value : arr) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return head;
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

public class SinglyLinkedList {
    public static void main(String[] args) {
        int arr[] = { 13, 24, 72, 16, 6 };
        int value = 20;
        Node head = Node.createLinkedListFromArray(arr);
        System.out.println("After creation of sll from array:");
        Node.printLinkedList(head);

        head = Node.insertAtHead(head, value);
        Node.insertAtTail(head, value);
        System.out.println("\nAfter insertion at both ends:");
        Node.printLinkedList(head);
        
        System.out.println("\nAfter deletion at both ends:");
        head = Node.deleteAtHead(head);
        head = Node.deleteAtTail(head);
        Node.printLinkedList(head);
    }
}
