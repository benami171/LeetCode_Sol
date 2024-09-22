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

        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);
        return merge(left_side,right_side);
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode sorted_temp = new ListNode(0);
        ListNode current_node = sorted_temp;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                current_node.next = head1;
                head1 = head1.next;
            } else {
                current_node.next = head2;
                head2 = head2.next;
            }
            current_node = current_node.next;
        }

        return sorted_temp.next;

    }
}
