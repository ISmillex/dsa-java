public class QueueCircular<T> {

    private int capacity;
    private int front;
    private int rear;
    private T[] queue;

    QueueCircular(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear+1)%capacity == front;
    }

    public void enqueue(T val) {
        if (isFull())
            System.out.println("Queue is full");
        else {
            rear = (rear+1)%capacity;
            queue[rear] = val;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T val = queue[front];
        front = (front+1)%capacity;

        return val;
    }


    public void print() {
        int i = front+1;

        do {
            System.out.print(queue[i] + " ");
            i = (i+1)%capacity;
        } while (i != (rear+1)%capacity);

        System.out.println();
    }






    public static void main(String[] args) {
        QueueCircular<Integer> queue = new QueueCircular<Integer>(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.print();

    }
}
