package Easy;

public class TODOLeetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode prev=newHead;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return newHead.next;
    }
}
