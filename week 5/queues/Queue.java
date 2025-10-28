class QueueOps{
    int arr[];
    int front,rear,size;

    public QueueOps(int capacity){
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull(){
       if(size==arr.length){
        return true;
       } 
       return false;
    }

    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full, cannot enqueue");
            return;
        }
        if(size==0){
            front = 0;
            rear = 0;
        }else{
            rear++;
        }
        arr[rear] = value;
        size++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return;
        }
        front++;
        size--;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty, cannot peek");
            return;
        }
        System.out.println(arr[front]);
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty, nothing to print");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]);
            if (i < rear) System.out.print(" | ");
        }
        System.out.println();
    }
}


public class Queue {
   public static void main(String[] args) {
    QueueOps q = new QueueOps(50);
    for(int i=1;i<=6;i++){
        q.enqueue(i);
    }
    q.print();
    q.dequeue();
    q.peek();
    q.print();
   } 
}
