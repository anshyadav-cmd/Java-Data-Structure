public class Question4 {
    // TODO Reverse adding two list
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.createLL(7);
        l1.insertNode(1);
        l1.insertNode(6);
        LinkedList l2 = new LinkedList();
        l2.createLL(5);
        l2.insertNode(9);
        l2.insertNode(3);

        LinkedList l3 = sumLists(l1,l2);
        l3.traversalLL();
    }
    public static LinkedList sumLists(LinkedList l1, LinkedList l2){
        int rem = 0, carry = 0;
        LinkedList l3 = new LinkedList();
        Node a = l1.head;
        Node b = l2.head;

        while(a != null || b != null || carry != 0) {
            int num1 = a == null ? 0 : a.value;
            int num2 = b == null ? 0 : b.value;
            rem = (num1 + num2 + carry) % 10;
            if(l3.head == null) {
                l3.createLL(rem);
            }else {
                l3.insertNode(rem);
            }
            carry = (num1+num2 + carry)/10;
            if(a != null)
                a = a.next;
            if(b != null)
                b = b.next;
        }
        return l3;
    }
}
