public class Main {
    public static void main(String[] args) {
        DoubleCircularLL linkedList = new DoubleCircularLL();

        linkedList.insertion(10, 2308);
        linkedList.insertion(20, 10);
        linkedList.insertion(50, 23423);
        linkedList.insertion(30, 2);
        linkedList.insertion(40, linkedList.size - 1);

        linkedList.display();
        linkedList.reverseDisplay();

        linkedList.insertion(00 , 0);
        linkedList.display();
        linkedList.reverseDisplay();


        System.out.println(linkedList.search(10));
        System.out.println(linkedList.search(100));
        System.out.println(linkedList.search(0));
        System.out.println(linkedList.search(00));
        System.out.println(linkedList.search(40));
        System.out.println(linkedList.search(340));
        System.out.println(linkedList.search(50));

        linkedList.delete(0);
        linkedList.display();

        linkedList.delete(123);
        linkedList.display();

        linkedList.delete(3);
        linkedList.display();

        linkedList.deleteAll();
        linkedList.display();

    }
}
