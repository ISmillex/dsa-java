


public class QueueArray<T> {

    private T[] queue;
    private int front;
    private int rear;
    private int capacity;

    QueueArray(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
    }


    public boolean isEmpty() {
        if (rear == front)
            return true;
        return false;
    }

    public boolean isFull() {
        return rear == capacity-1;
    }

    public void enqueue(T val) {
        if (isFull())
            System.out.println("Queue is full");
        else
            queue[++rear] = val;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        else
            return queue[++front];
    }

    public void print() {
        for (int i=front+1; i<=rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }



    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<Integer>(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();
        queue.dequeue();
        System.out.println(queue.dequeue());
        queue.print();

    }
}