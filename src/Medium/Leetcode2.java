package Medium;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//Referred lc approach1
class Leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ansPtr=new ListNode(-1);
        ListNode ptr=ansPtr;
        while(l1!=null || l2!=null){
            int digit1=l1==null?0:l1.val;
            int digit2=l2==null?0:l2.val;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
            int sumTemp=digit1+digit2+carry;
            if(sumTemp>=10){
                carry=1;
            }
            else{
                carry=0;
            }
            sumTemp=sumTemp%10;
            ptr.next=new ListNode(sumTemp);
            ptr=ptr.next;
        }
        if(carry==1){
            ptr.next=new ListNode(carry);
        }
        return ansPtr.next;
    }
}
