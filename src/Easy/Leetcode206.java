package Easy;

//Best solution: Referred LC solution 1, also refer solution //https://leetcode.com/submissions/detail/804046933/
class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}

/**
 * Recursive solution: LC approach 2:
 * public ListNode reverseList(ListNode head) {
 *         if (head == null || head.next == null) {
 *             return head;
 *         }
 *         ListNode newHead=reverseList(head.next);
 *         head.next.next=head;
 *         head.next=null;
 *         return newHead;
 *     }
 */
