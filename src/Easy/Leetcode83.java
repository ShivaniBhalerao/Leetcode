package Easy;

public class Leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node!=null && node.next!=null){
            if(node.next.val==node.val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        return head;
    }
}
