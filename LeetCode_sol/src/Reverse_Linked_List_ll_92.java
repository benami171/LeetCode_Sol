public class Reverse_Linked_List_ll_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        while (left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }

        ListNode connector = prev;
        ListNode tail = curr;

        while (right > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            right--;
        }

        if (connector != null) {
            connector.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;
        return head;
    }
}
