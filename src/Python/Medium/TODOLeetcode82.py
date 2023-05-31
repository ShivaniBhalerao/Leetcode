# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        dummy=ListNode(0)
        dummy.next=head
        prev=dummy
        curr=head

        while prev.next is not None and curr.next is not None:
            if prev.next.val!=curr.next.val:
                prev=prev.next
                curr=curr.next
            else:
                curr_val=curr.val
                while curr is not None and curr_val==curr.val:
                    curr=curr.next
                prev.next=curr

        return dummy.next