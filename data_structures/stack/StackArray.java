import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackArray<T> {

    private final int capacity;
    private final T[] stack;
    private int top;

    StackArray(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return this.top == -1; 
    }

    public boolean isFull() {
        return this.capacity == top+1;
    }

    public void push(T val) {
        if (isFull()) {
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = val;
    }

    public T pop() {
        if (isEmpty())
            throw new StackOverflowError();
        return stack[top--];
    }

    public T peek(int index) {
        if (top - index < 0)
            throw new NoSuchElementException();
        return stack[top-index];
    }

    public T first() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[top];
    }


    public void print() {
        for (int i=top; i>=0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();

        System.out.println(stack.pop());
        stack.print();

        System.out.println(stack.peek(2));
        System.out.println(stack.first());

        stack.print();



    }
}
