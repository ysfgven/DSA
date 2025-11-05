import java.util.ArrayList;

public class ArrayListStack<T> {
    private ArrayList<T> stack;

    public ArrayListStack() {
        stack = new ArrayList();

    }
    public void push(T o){
        stack.add(o);
    }
    public T pop(){
        if(stack.isEmpty())
            return null;
        return stack.remove(stack.size()-1);
    }
    public T peek(){
        if(stack.isEmpty())
            return null;
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){ //No usage in here but it would be good to keep for later use when we want to protect encapsulation.
        return stack.isEmpty();
    }

    //No need to implement isFull it's ArrayList

}
