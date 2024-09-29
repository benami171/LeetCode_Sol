public class Reverse_Linked_List_206 {

    public ListNode reverseList(ListNode head) {
    ListNode prev = null;

    while(head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }

    }
}
