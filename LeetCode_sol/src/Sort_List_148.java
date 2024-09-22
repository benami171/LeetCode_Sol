public class Sort_List_148 {
    public ListNode sortList(ListNode head) {
        if ( head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null || fast.next != null) {
            temp = slow;
            slow = head.next;
            fast = head.next.next;
        }

    }
}
