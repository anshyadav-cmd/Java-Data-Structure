public class Queue {
    private int[] arr ;
    private int beginningOfQueue;
    private int topOfQueue;


    // Constructor
    public Queue (int size) {
        arr = new int[size];
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Queue successfully created size of " + size);
    }

    // isFull method
    public boolean isFull () {
        return topOfQueue == arr.length -1 ? true : false;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length  ? true : false;
    }

    // enqueue method or insertion
    public void enQueue(int value) {
        if(isFull()){
            System.out.println("Queue is Full");
        }else if(isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted element " + value);
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted element " + value);
        }
     }

     // dequeue method pr deletion
     public int deQueue() {
        if(isEmpty()) {
            System.out.println("queue is empty");
            return  Integer.MIN_VALUE;
        }
        int value = arr[beginningOfQueue];
        beginningOfQueue++;
        if(beginningOfQueue > topOfQueue) {
            beginningOfQueue = topOfQueue = -1;
        }
        return  value;
     }

     // peek method
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return  arr[beginningOfQueue];
    }

    // delete queue
    public void delete() {
        this.arr = null;
        System.out.println("Queue deleted successfully.");
    }
}
