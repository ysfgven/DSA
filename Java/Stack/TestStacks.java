public class TestStacks {
    public static void main(String[] args) {

        System.out.println("=== Testing ArrayList-based Stack ===");
        ArrayListStack<Integer> listStack = new ArrayListStack<>();
        listStack.push(10);
        listStack.push(20);
        listStack.push(30);

        System.out.println("Peek: " + listStack.peek()); // 30
        System.out.println("Pop: " + listStack.pop());   // 30
        System.out.println("Pop: " + listStack.pop());   // 20
        System.out.println("Is empty? " + listStack.isEmpty()); // false
        System.out.println("Pop: " + listStack.pop());   // 10
        System.out.println("Is empty? " + listStack.isEmpty()); // true
        System.out.println("Pop when empty: " + listStack.pop()); // null


        System.out.println("\n=== Testing Array-based Stack ===");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        arrayStack.push(5);
        arrayStack.push(15);
        arrayStack.push(25);

        System.out.println("Peek: " + arrayStack.peek()); // 25
        System.out.println("Pop: " + arrayStack.pop());   // 25
        System.out.println("Pop: " + arrayStack.pop());   // 15
        System.out.println("Is empty? " + arrayStack.isEmpty()); // false
        System.out.println("Pop: " + arrayStack.pop());   // 5
        System.out.println("Is empty? " + arrayStack.isEmpty()); // true

        // Optional: fill it to test isFull()
        try {
            for (int i = 0; i < 11; i++) {
                arrayStack.push(i);
            }
        } catch (RuntimeException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
        //Queue Test
        Queue<String> q = new Queue<>(3);
        q.enqueue("Yusuf");
        q.enqueue("Güven");
        System.out.println(q.dequeue());

    }
}
