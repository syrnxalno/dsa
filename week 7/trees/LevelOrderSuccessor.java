import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LevelOrderSuccessor {

    public static Node findSuccessor(Node root, int key) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // add children to queue
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);

            // once key is found, the next node in queue is successor
            if (current.val == key) {
                return queue.peek(); // may return null if no successor
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node result = findSuccessor(root, 3);
        System.out.println(result != null ? result.val : "No successor found");
    }
}
