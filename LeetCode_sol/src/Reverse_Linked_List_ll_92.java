public class Reverse_Linked_List_ll_92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        while (m > 1) {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        // now that we're here, the n is the number of indexes from the current point forward
        // that we need to reverse, say we got m=2 and n=4, once we got to position 2, we have
        // 3 numbers including the current one to reverse.
        ListNode connector = prev;
        ListNode tail = curr; // will use to connect the reverse tail

        while (n > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
        }

        if (connector != null) {
            connector.next = prev;
        } else {

        }
    }
}
// 1->2->3->4->5->NULL
// prev = 1, curr = 2, connector = 1, tail = 2
//