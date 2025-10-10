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

    // when sll class does not have 'prev' pointer at all (default state)
    public static DLLNode convertSllToDll(Node head) {
        if (head == null)
            return null;

        DLLNode dllHead = new DLLNode(head.data);
        DLLNode prev = dllHead;

        Node current = head.next;
        while (current != null) {
            DLLNode newNode = new DLLNode(current.data);
            prev.next = newNode;
            newNode.prev = prev;
            prev = newNode;
            current = current.next;
        }

        return dllHead;
    }
}

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    public DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void printLinkedList(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("<-> ");
            }
            temp = temp.next;
        }
    }
}

public class SinglyToDoubly {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(21);
        head.next.next = new Node(33);
        head.next.next.next = new Node(25);
        DLLNode dllNode = Node.convertSllToDll(head);
        DLLNode.printLinkedList(dllNode);
    }
}
