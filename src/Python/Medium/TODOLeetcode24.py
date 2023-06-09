# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head

        prev=ListNode(-1)
        prev.next=head

        while prev.next and prev.next.next:
            nextNode=prev.next
            prev.next=nextNode.next
            nextNode.next=nextNode.next.next
            prev.next.next=nextNode

            if prev.val==-1:
                head=prev.next

            prev=prev.next.next


        return head