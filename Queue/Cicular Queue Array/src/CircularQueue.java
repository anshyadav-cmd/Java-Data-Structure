public class CircularQueue {
    private int[] arr ;
    private int topOfQueue;
    private int beginningOfQueue;
    private int size;

    public CircularQueue(int size) {
        arr = new int[size];
        topOfQueue = beginningOfQueue = -1;
        this.size = size;
        System.out.println("Circular Queue is Successfully created of size " + size);
    }

    // isEmpty method
    public boolean isEmpty() {
        return  topOfQueue == -1 ? true : false;
    }

    // isfull method
    public boolean isFull() {
        if(topOfQueue+1 == beginningOfQueue){
            return  true;
        }else if (beginningOfQueue == 0 && topOfQueue == arr.length-1){
            return  true;
        }
        return  false;
    }

    // enQueue method
    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()) {
            topOfQueue = beginningOfQueue = 0;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value : " + value);
        }else {
            if(topOfQueue == arr.length-1) {
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value : " + value);
        }
    }

    // deQueue method
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value = arr[beginningOfQueue];
        arr[beginningOfQueue] = Integer.MIN_VALUE;
        if (beginningOfQueue == topOfQueue) {
            beginningOfQueue = topOfQueue = -1;
        }
        else if(beginningOfQueue == arr.length -1) {
            beginningOfQueue = 0;
        }else {
            beginningOfQueue++;
        }
        return value;
    }


    // peek method
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return  Integer.MIN_VALUE;
        }
        return  arr[beginningOfQueue];
    }

    // delete method
    public void delete() {
        arr = null;
        System.out.println("Queue is successfully deleted");
    }
}
