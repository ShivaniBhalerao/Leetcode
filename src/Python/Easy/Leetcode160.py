# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        tempHeadA=headA
        tempHeadB=headB

        while headA!=headB:
            headA=tempHeadB if headA is None else headA.next
            headB=tempHeadA if headB is None else headB.next

        return headA