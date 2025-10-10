package stack;

class StackOps {
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push");
            return;
        }
        top++;
        arr[top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    int peek() {
        return arr[top];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        }
        return false;
    }

    void printStack() {
        if (isEmpty())
            return;
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        StackOps st = new StackOps();
        st.push(23);
        st.push(24);
        st.push(27);
        st.pop();
        st.printStack();
    }
}
