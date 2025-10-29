import java.util.Queue;
import java.util.LinkedList;

class StackOps {
    // using 2 queues to mimic a stack
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int value) {
        // store initial value in q2
        q2.add(value);

        // move elements from q1 to q2 (if any)
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // swap contents of both queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    int pop() {
        if (q1.isEmpty())
            return -1;
        return q1.remove();
    }

    int peek() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
    StackOps s = new StackOps();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()); 
        System.out.println(s.peek());
    }
}
