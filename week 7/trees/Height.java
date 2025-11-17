import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void height(Node root) {
        if (root == null) {
            System.out.println("The height of the tree is 0");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;

        while (!q.isEmpty()) {
            int size = q.size(); // number of nodes at current level

            // process all nodes of current level
            for (int i = 0; i < size; i++) {
                Node current = q.poll();

                if (current.left != null)
                    q.add(current.left);
                if (current.right != null)
                    q.add(current.right);
            }

            height++; // increment after processing a full level
        }

        System.out.println("The height of the tree is " + height);
    }
}

public class Height {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.height(root);
    }
}
