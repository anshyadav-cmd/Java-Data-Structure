public class DoubleCircularLL {
    private Node head;
    private Node tail;
    public  int size = 0;

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
    public void insertion(int value, int position) {
        Node node = new Node();
        node.value = value;
        if(head == null) {
            createDCLL(value);
            return;
        }
        if(position == 0) {
            node.next = head;
            node.prev = head.prev;
            head.prev = node;
            head = node;
            tail.next = head;
        }
        else if(position >= size) {
            node.next = tail.next;
            node.prev = tail;
            tail.next = node;
            tail = node;
            head.prev = tail;
        }
        else {
            Node tempNode = head;
            for(int i= 1 ; i < position; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            node.prev = tempNode;
            tempNode.next.prev = node;
            tempNode.next = node;
        }
        size++;
    }

    public void display() {
        if(head == null) {
            System.out.println("Linked list is empty or do not exists");
            return;
        }
        Node tempNode = head;
       while(tempNode.next != head) {
           System.out.print(tempNode.value + " -> ");
           tempNode = tempNode.next;
       }
        System.out.println(tempNode.value);
    }

    public void reverseDisplay() {
        if(head == null) {
            System.out.println("LInked list is empty or do not existis");
            return;
        }
        Node tempNode = tail;
        while(tempNode.prev != tail) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.prev;
        }
        System.out.println(tempNode.value);
    }

    public boolean search(int value) {
        if(head == null) {
            System.out.println("Linked list is empty or do not exstis");
            return false;
        }
        Node tempNode = head;
        for(int i = 0; i < size ; i++) {
            if(tempNode.value == value) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public void delete(int position) {
        if(head == null) {
            System.out.println("Linked list is empty or do not exists");
            return;
        }
        if (head == tail) {
            head.next =null;
            head.prev = null;
            head = null;
            tail = null;
        }else if(position == 0) {
            head.prev = null;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }else if (position >= size) {
            tail.next = null;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }else {
            Node tempNode = head;
            for(int i =1 ; i < position; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
        size--;
    }

    public void deleteAll() {
        if(head == null) {
            System.out.println("Linked list is empty or do not exists");
            return;
        }
        tail.next = null;
        Node tempNode = head;
        for(int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        size = 0;
    }
}
