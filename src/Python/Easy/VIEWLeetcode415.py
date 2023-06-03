#Refer editorial for more similar questions and join function.
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        ptr1=len(num1)-1
        ptr2=len(num2)-1
        carry=0
        ans=[]
        while ptr1>=0 or ptr2>=0:
            digit1=int(num1[ptr1]) if ptr1>=0 else 0
            digit2=int(num2[ptr2]) if ptr2>=0 else 0
            digit_sum=digit1+digit2+carry
            carry=1 if digit_sum>=10 else 0
            digit_sum=digit_sum%10

            ans.append(digit_sum)
            ptr1-=1
            ptr2-=1

        if carry==1:
            ans.append(carry)

        return ''.join(str(x) for x in ans[::-1])