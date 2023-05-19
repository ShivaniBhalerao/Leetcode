package Medium;

public class Leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead=new ListNode(-1);
        newHead.next=head;
        ListNode front=newHead;
        ListNode back=newHead;
        while(n>0){
            front=front.next;
            n--;
        }
        while(front.next!=null){
            front=front.next;
            back=back.next;
        }
        back.next=back.next.next;

        return newHead.next;
    }
}
