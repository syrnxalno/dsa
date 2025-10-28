class QueueOps {
    int arr[];
    int front, rear, size;

    public QueueOps(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return;
        }

        if (front == rear) {
            // only one element left
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            return;
        }
        System.out.println(arr[front]);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing to print");
            return;
        }

        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(arr[i]);
            if (count > 1) System.out.print(" | ");
            i = (i + 1) % arr.length;
            count--;
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        QueueOps q = new QueueOps(5);

        for(int i=1;i<=4;i++){
            q.enqueue(i);
        }
        q.print();

        q.dequeue();
        q.print();

        q.enqueue(6);
        q.enqueue(7);
        q.print();

        q.peek();
    }
}

