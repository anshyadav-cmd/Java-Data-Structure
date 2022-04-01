public class Question5 {
    /**
     * Intersection
     *
     * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
     * node. Note that the intersection is defined based on reference, not value. That is, if the kth
     * node of the first linked list is the exact same node (by reference) as the jth node of the
     * second linked list, then they are intersecting.
     */

    // Add same node
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;

    }

    //TODO
     public  Node findIntetsection(LinkedList l1 , LinkedList l2) {
        int sizeDifferece = l1.size - l2.size;
        Node head1 = l1.head;
        Node head2 = l2.head;
        if(l1.size < l2.size) {
            for(int i = 0 ;i < Math.abs(sizeDifferece); i++) {
                head2 = head2.next;
            }
        }else {
            for(int i = 0 ; i < Math.abs(sizeDifferece); i++) {
                head1 = head1.next;
            }
        }
        while(head1 != null && head2 != null) {
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return  null;
    }
}