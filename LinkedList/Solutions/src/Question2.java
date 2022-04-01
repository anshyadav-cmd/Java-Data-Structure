public class Question2 {
    // TODO Printing Last Second Value

    public Node nthToLast(LinkedList ll, int n) {
        Node head = ll.head;
        Node prev = null;

        while(head.next != null) {
            prev = head;
            head = head.next;
        }
        return prev;
    }
}
