# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ptr1=l1
        ptr2=l2
        carry=0
        headDummy=ListNode(0)
        ptr=headDummy
        while ptr1 is not None or ptr2 is not None:
            val1=0 if ptr1 is None else ptr1.val
            val2=0 if ptr2 is None else ptr2.val
            sumDigit=val1+val2+carry
            carry=1 if sumDigit>=10 else 0
            sumDigit=sumDigit%10
            nextNode=ListNode(sumDigit)
            ptr.next=nextNode
            ptr=ptr.next
            ptr1=ptr1 if ptr1 is None else ptr1.next
            ptr2=ptr2.next if ptr2 is not None else ptr2

        if carry==1:
            ptr.next=ListNode(carry)
        return headDummy.next
