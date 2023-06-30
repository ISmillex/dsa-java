
import java.util.NoSuchElementException;

public class QueueLinkedList<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    class Node<T> {
        T val;
        Node<T> next;
        public Node(T val) {
            this.val = val;
            next = null;
        } 
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T val) {
        Node<T> curr = new Node<T>(val);
        if (isEmpty()) {
            front = curr;
        }
        else {
            rear.next = curr;
        }
        rear = curr;
        size++;
    }


    public T dequeu() {
        if (isEmpty())
            throw new NoSuchElementException();
        T res = front.val;
        front = front.next;
        if (front.next == null) 
            rear = null;
        size--;
        return res;
        
    }


    public T getFront() {
        if (isEmpty())
            throw new NoSuchElementException();
        return front.val;
    }


    public T getRear() {
        if (isEmpty())
            throw new NoSuchElementException();
        return rear.val;
    }


    public void print() {
        Node<T> curr = front;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(8);
        queue.print();
        queue.dequeu();
        queue.print();
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());

    }
}