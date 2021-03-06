public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.deQueue();

        System.out.println(queue.peek());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.peek());

        queue.deQueue();
        queue.deQueue();

        System.out.println(queue.peek());

        queue.deQueue();

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.delete();

        try {
            System.out.println(queue.peek());
        }catch (NullPointerException e) {
            System.err.println("NUll pointer exception");
        };
    }
}
