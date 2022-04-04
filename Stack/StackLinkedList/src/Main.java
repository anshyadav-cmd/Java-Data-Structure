public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pop();
        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.delete();
    }
}
