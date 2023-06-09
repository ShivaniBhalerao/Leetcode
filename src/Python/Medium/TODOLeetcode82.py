# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        sentinel=ListNode(-101)
        pred=sentinel

        while head:
            if head.next is not None and head.val==head.next.val:
                while head.next is not None and head.val==head.next.val:
                    head=head.next
                pred.next=None

            else:
                if sentinel.val==-101:
                    sentinel.next=head
                    sentinel=sentinel.next

                pred.next=head
                pred=pred.next
            head=head.next



        return sentinel if sentinel.val!=-101 else None