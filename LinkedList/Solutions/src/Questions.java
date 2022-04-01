import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Questions {
    // TODO: Remove Duplicates in unsorted Linked List

    /**
     * Solution 1
     */
//    public void deleteDups(LinkedList linkedList) {
//        Map<Integer , Integer> map = new HashMap<>();
//        Node tempNode = linkedList.head;
//        for(int i = 0 ; i < linkedList.size ; i++) {
//            if(map.containsKey(tempNode.value)){
//                deleteNode(linkedList, i);
//            }else{
//                map.put(tempNode.value, i);
//            }
//            tempNode = tempNode.next;
//        }
//    }
//
//    private void deleteNode(LinkedList linkedList, int position){
//        Node tempNode = linkedList.head;
//        if(linkedList.head == linkedList.tail) {
//            tempNode.next = null;
//            linkedList.head = null;
//            linkedList.tail = null;
//            linkedList.size = 0;
//            return;
//        }
//        if(position == 0) {
//            tempNode = tempNode.next;
//            linkedList.head.next = null;
//            linkedList.head = tempNode;
//        }else if(position >= linkedList.size) {
//            while(tempNode.next != null) {
//                tempNode = tempNode.next;
//            }
//            tempNode.next = null;
//            linkedList.tail = tempNode;
//        }else {
//            for(int i = 1; i < position; i++) {
//                tempNode = tempNode.next;
//            }
//            tempNode.next = tempNode.next.next;
//        }
//        linkedList.size--;
//    }

    /**
     * Solution 2
     */
    public void deleteDups (LinkedList linkedList){
        Node node = linkedList.head;
        Node prev = null;
        HashSet<Integer> hashSet = new HashSet<>();
        while(node.next != null) {
            if(hashSet.contains(node.value)){
                prev.next = node.next;
                linkedList.size--;
            }else {
                hashSet.add(node.value);
            }
            prev = node;
            node = node.next;
        }
    }

}

