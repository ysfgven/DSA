public class ArrayStack<T> {

    private T[] stack;
    private int top;
    private int size;

    public ArrayStack(){
        size = 10; //Can be changed to desired value
        stack = (T[]) new Object[size]; //Size must be initialized before this line!
        top = -1;

    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }

    public void push(T item){
        if (isFull())
            throw new StackOverflowError("Stack is full");
        stack[++top]=item; //adds top
    }
    public T pop(){
        if (isEmpty())
            return null; //returns null if its empty
        T item = stack[top]; //Holds the item that will be removed.
        stack[top] = null;
        top--;
        return item; // returns the removed item in case of future usage.
    }
    public T peek(){
        if(isEmpty())
            return null; //returns null if its empty
        return stack[top];
    }

}
