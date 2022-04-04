public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.delete();

        try {
            stack.push(23);
        }catch (NullPointerException e) {
            System.err.println("This is NUll Pointer Exception");
        }


    }
}
