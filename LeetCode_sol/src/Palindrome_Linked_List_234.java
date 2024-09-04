/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */




// 1 2 3 2 1
class Palindrome_Linked_List_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true; // an empty list is considered a palindrome
        }

        ListNode slow = head;
        ListNode fast = head;
        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reversed(slow);
        fast = head;
        while ( slow != null){
            if (fast.val != slow.val){
                return false;

            }
            slow = slow.next;
            fast = fast.next;

        }
        return true;
    }
    // 1 2 3 2 1
// head = 3,2,1,[]
// prev = [],3,2,1
// next = 2,1,[]
// head.next = [],3 ,2
    private ListNode reversed(ListNode head){
        ListNode prev = null;

        while ( head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;

    }
}