package linkedlist;

import java.util.HashMap;

class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    // detect loop using hashmap
    public static boolean detectCycle(Node head){
        Node temp = head;
         HashMap<Node,Integer> hp = new HashMap<>();
        while(temp!=null){
            if(hp.containsKey(temp)){
                return true;
            }
            hp.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    // detect loop using floyd's cycle detection
    public static boolean detectLoop(Node head){
        Node slow=head, fast=head;
        while(fast.next!=null || fast!=null){
            if(fast==slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

public class DetectLoopSLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(28);
        head.next.next = new Node(38);
        head.next.next.next = new Node(12);
        head.next.next.next.next = head.next.next;

        if(Node.detectLoop(head)){
            System.out.println("Loop Detected");
        }else{
            System.out.println("No Loop Detected");
        }
    }
}
