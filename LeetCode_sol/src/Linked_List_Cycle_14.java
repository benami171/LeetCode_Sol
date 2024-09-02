
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linked_List_Cycle_14 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;

        while ( slow != fast){
            if( fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;


    }
}
