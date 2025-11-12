package trees;

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

class PostorderTraversal{
    public void postorder(Node root, List<Integer> arr){
        if(root==null){
            return;
        }
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);
    }

    public void print(Node root){
        List<Integer> arr = new ArrayList<>();
        postorder(root,arr);
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}

public class PostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        PostorderTraversal t = new PostorderTraversal();
        t.print(root);
    }
}
