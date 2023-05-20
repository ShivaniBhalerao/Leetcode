package Medium;

//Referred https://www.youtube.com/watch?v=wjYnzkAhcNk&t=392s for the logic from line 26
public class TODOLeetcode142 {
    public ListNode intersection(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return fast;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode intersection=intersection(head);
        if(intersection==null){
            return null;
        }
        while(head!=intersection){
            head=head.next;
            intersection=intersection.next;
        }
        return head;

    }

    //simple solution but uses space
//    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> set=new HashSet<>();
//        while(head!=null){
//            if(set.contains(head)){
//                return head;
//            }
//            set.add(head);
//            head=head.next;
//        }
//        return null;
//    }
}
