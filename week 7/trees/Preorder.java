import java.util.ArrayList;
import java.util.List;

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

class PreorderTraversal{
    public void preorder(Node root, List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    public void print(Node root){
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}

public class Preorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        PreorderTraversal t = new PreorderTraversal();
        t.print(root);
    }
}
