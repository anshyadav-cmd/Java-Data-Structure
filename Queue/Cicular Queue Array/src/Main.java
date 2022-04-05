import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.peek());

        queue.deQueue();
        queue.deQueue();

        System.out.println(queue.peek());

        queue.deQueue();

        System.out.println(queue.peek());

        queue.deQueue();
        queue.deQueue();

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.delete();

        try {
            queue.enQueue(10);
        }catch (NullPointerException e) {
            System.err.println("Null pointer execption");
        }
        try {
            System.out.println(queue.peek());
        }catch (NullPointerException e) {
            System.err.println("Null pointer execption");
        }


    }
}
