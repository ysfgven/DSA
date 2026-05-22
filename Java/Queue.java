public class Queue<T> {
    private T[] data;
    private int head;
    private int tail;
    private int capacity;
    public Queue(int capacity) {
        head = -1;
        tail = -1;
        this.data = (T[]) new Object[capacity];
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        if(head == -1 && tail == -1) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if(tail == capacity-1) {
            return true;
        }
        return false;
    }
    public void enqueue(T item) {
        if (isEmpty()) {
            head = 0;
        }
        tail++;
        data[tail] = item;

    }
    /*
    This making the one of the spaces for data is null BUT there is still memory usage
    comes from the space itself in java we dont have memory management so its not efficient
     */
    public T dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = data[head];
        data[head] = null;
        if(head == tail) {
            head = -1;
            tail = -1;
        }else{
            head++;
        }
        return item;
    }


}

