class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.right.left = new Node(5);
        printTree(root);
    }

    public static void printTree(Node node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }
}
