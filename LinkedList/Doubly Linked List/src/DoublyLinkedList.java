public class DoublyLinkedList {
    Node head ;
    Node tail ;
    int size ;

    public Node createDLL(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        node.prev = null;

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public void insert(int value, int position) {
        Node node = new Node();
        node.value = value;
        if(head == null) {
            createDLL(value);
            return;
        }
        if(position == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }else if (position >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            for(int i = 0 ; i < position-1; i++) {
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
            System.out.println("The Doubly Linked List is Empty or don not exists");
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode  = tempNode.next;
        }
        System.out.println(tempNode.value);
    }

    public void reverseDisplay() {
        if(head == null) {
            System.out.println("The Doubly Linked List is Empty or don not exists");
            return;
        }
        Node tempNode = tail;
        while(tempNode.prev != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.prev;
        }
        System.out.println(tempNode.value);
    }

    public boolean search(int value){
        if(head == null) {
            System.out.println("The Doubly Linked List is Empty or don not exists");
            return false;
        }
        Node tempNode = head;
        while(tempNode != null) {
            if(tempNode.value == value) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public void deleteNode(int position) {
        if(head == null){
            System.out.println("The Doubly Linked List is Empty or don not exists");
            return ;
        }
        if(position == 0) {
            if(head.next == null && head.prev == null) {
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        } else if (position >= size) {
            if(size == 1){
                head =null;
                tail = null;
                size--;
                return;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }else {
            Node tempNode = head;
            for(int i = 0; i < position-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }
    public void deleteAll() {
        if(head == null){
            System.out.println("The Doubly Linked List is Empty or don not exists");
            return ;
        }
        Node tempNode = head;
        while(tempNode != null) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
    }
}
