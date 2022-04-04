public class Stack {
    private LinkedList linkedList ;

    public Stack() {
        linkedList = new LinkedList();
    }

    // push method
    public void push(int value) {
        linkedList.insertinAtBeginning(value);
        System.out.println("Inserted value : " + value);
    }

    // pop method
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            int topStack = peek();
            linkedList.deletionAtBegnning();
            System.out.println("Deleted value : " + topStack);
        }
    }

    // isEmpty method
    public boolean isEmpty() {
        return linkedList.head == null ? true : false;
    }


    // peek()
    public int peek() {
        if(!isEmpty()) {
            return linkedList.head.value;
        }else {
            return Integer.MIN_VALUE;
        }
    }

    // delete
    public void delete() {
        linkedList.head = null;
        System.out.println("Stack Deletion Successful.");
    }
}
