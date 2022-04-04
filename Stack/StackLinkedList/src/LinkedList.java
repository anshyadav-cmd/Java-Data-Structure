public class LinkedList {
    Node head;
    Node tail;
    int size;

    public Node createSinglyLinkedList(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node ;
        size = 1;
        return head;
    }

    public void insertinAtBeginning(int value) {
        if(head == null) {
            createSinglyLinkedList(value);
            return;
        }
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
        size++;
    }

    public void deletionAtBegnning() {
        if(head == null) {
            System.out.println("Linked list empty or do not Exist");
            return;
        }
        head = head.next;
        size--;
    }

}
