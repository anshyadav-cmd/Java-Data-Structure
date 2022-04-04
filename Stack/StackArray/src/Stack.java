public class Stack {
    private int[] arr ;
    private int topOfStack;

    // Creation
    public Stack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created with size of " + size);
    }

    // isEmpty
    public boolean isEmpty() {
       return topOfStack < 0 ? true : false;
    }

    // isFull
    public boolean isFull () {
        return topOfStack == arr.length -1 ? true : false;
    }

    // push
    public void push(int num) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }else {
            arr[topOfStack + 1] = num;
            topOfStack++;
            System.out.println("Element Inserted");
        }
    }

    //pop
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }else {
            int topStack  = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // peek
    public int peek(){
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }else {
            int topStack = arr[topOfStack];
            return topStack;
        }
        return Integer.MIN_VALUE;
    }

    // delete Method
    public void delete() {
        arr = null;
        System.out.println("Stack is successfully deleted");
    }
}
