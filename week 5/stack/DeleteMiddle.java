import java.util.Stack;

public class DeleteMiddle{

    // recursive function to delete middle element
    static void deleteMiddle(Stack<Integer> stack, int current, int size) {
        if (stack.isEmpty() || current == size)
            return;

        // pop the top element
        int x = stack.pop();
        deleteMiddle(stack, current + 1, size);

        if (current != size / 2)
            stack.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push elements
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        System.out.println("Original Stack: " + stack);
        int size = stack.size();

        deleteMiddle(stack, 0, size);
        System.out.println("Stack after deleting middle element: " + stack);
    }
}
