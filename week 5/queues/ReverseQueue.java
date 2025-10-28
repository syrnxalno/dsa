import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
   
    // using stack
    static Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.peek());
            q.remove();
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        return q;
    }

    // using recursion
    static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        System.out.println("Before reversal: "+q);
        reverse(q);
        System.out.println("After reversal: "+q);
    }
}
