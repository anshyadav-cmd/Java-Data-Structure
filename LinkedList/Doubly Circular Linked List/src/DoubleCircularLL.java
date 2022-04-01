public class DoubleCircularLL {
    private Node head;
    private Node tail;
    private int size = 0;

    public Node createDCLL (int value) {
        Node node = new Node();
        node.value= value;
        node.prev = node;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

}
