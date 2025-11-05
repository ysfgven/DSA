package LinkedListStack;

public class LinkedListStack<T> {

    private Node<T> top;

    public LinkedListStack() {
        top = null;//Stack is empty at start
    }

    public boolean isEmpty() {
        return top == null;
    }
    public void push(T data) {
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        newNode.next = top; //old top is going down
        top = newNode; //new element becomes top
    }
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }



}
