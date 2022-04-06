public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.isEmpty());

        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        queue.deQueue();
        System.out.println(queue.isEmpty());

        queue.deQueue();
        System.out.println(queue.isEmpty());
    }
}
