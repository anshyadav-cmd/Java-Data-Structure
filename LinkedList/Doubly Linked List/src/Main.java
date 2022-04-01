public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.display();
        linkedList.insert(30, 100);
        linkedList.insert(10, 0);
        linkedList.insert(20,1);
        linkedList.insert(50, linkedList.size);
        linkedList.insert(40, linkedList.size-1);
        linkedList.display();
        linkedList.reverseDisplay();

        System.out.println(linkedList.search(10));
        System.out.println(linkedList.search(100));
        System.out.println(linkedList.search(50));
        System.out.println(linkedList.search(40));

        linkedList.deleteNode(0);
        linkedList.display();
        linkedList.deleteNode(100);
        linkedList.display();
        linkedList.deleteNode((int)linkedList.size/2);
        linkedList.display();

        linkedList.deleteAll();
        linkedList.display();
    }
}
