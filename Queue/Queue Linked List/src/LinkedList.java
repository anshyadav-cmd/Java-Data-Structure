public class LinkedList {
    public Node head;
    public Node tail;
    public  int size;

    public Node createLinkedList(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return  head;
    }

    public void insertionAtEnd(int value) {
        if(head == null) {
            createLinkedList(value);
            return;
        }
        Node node = new Node();
        node.value = value;
        node.next = null;


//        // O (N)   Time complexity
//        Node temp = head;
//        while(temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = node;
//        tail = node;

        // O (1)  time complexity
        tail.next = node;
        tail = node;
        size++;
    }

    public int deletionAtBeginning() {
        if(head == null) {
            System.out.println("Linked list is empty or do not exists");
            return Integer.MIN_VALUE;
        }
        int value = head.value;
        if(head.next == null) {
            head  = tail = null;
        }else {
            head = head.next;
        }
        size--;
        return value;
    }
}
