class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class CountLeafNodes {
    public static int countLeaves(Node root) {
        if (root == null) return 0;

        // if node is a leaf node
        if (root.left == null && root.right == null)
            return 1;

        // else recursively count in left and right subtree
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Number of leaf nodes = " + countLeaves(root)); 
    }
}
