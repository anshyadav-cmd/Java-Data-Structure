public class Queue {
    public LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
        System.out.println("Queue of Linked List created");
    }

    public void enQueue(int value){
        linkedList.insertionAtEnd(value);
        System.out.println("Inserted value " + value);
    }
    public void deQueue() {
       if(isEmpty()) {
           System.out.println("Linked list queue is empty");
           return;
       }
       int value = peek();
       linkedList.deletionAtBeginning();
        System.out.println(value + " is deleted.");
    }

    public void delete() {
        linkedList.head = null;
        linkedList.tail = null;
        linkedList = null;
        System.out.println("Linked List queue is successfully deleted.");
    }

    public boolean isEmpty() {
        return linkedList.head == null ? true : false;
    }

    public int peek() {
        return linkedList.head.value;
    }
}
