import java.util.NoSuchElementException;

public class StackLinkedList<T> {

    class Node<T> {
        private T val;
        private Node<T> next;
        Node(T val) {
            this.next = null;
            this.val = val;
        }
    }
    private Node<T> top;
    private int size;
    StackLinkedList() {
        this.top = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void push(T val) {
        Node<T> newNode = new Node<T>(val);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty())
            throw new NoSuchElementException();
        size--;
        T val = top.val;
        top = top.next;
        return val;
    }

    public T peek(int index) {
        int count = 0;
        Node<T> curr = top;
        while (count<index) {
            curr = curr.next;
            count++;
        }
        return curr.val;
    }

    public T first() {
        return top.val;
    }

    public void print() {
        Node<T> curr = top;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.peek(2));
        System.out.println(stack.first());
        stack.print();
    }
}