import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class InorderTraversal{
    public void inorder(Node root, List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public void print(Node root){
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}

public class Inorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        InorderTraversal t = new InorderTraversal();
        t.print(root);
    }
}
