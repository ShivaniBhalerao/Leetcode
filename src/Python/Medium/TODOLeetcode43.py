#Refer last approach
class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if len(num1)<len(num1): #num2 should be smaller
            return self.multiply(num2,num1)
        if num1=="0" or num2=="0":
            return "0"

        max_len=0
        array_to_sum=[]
        index=0
        for digit2_char in num2[::-1]:
            digit2=int(digit2_char)
            carry=0
            curr_sum=""
            for digit1_char in num1[::-1]:
                digit1=int(digit1_char)
                digit=(digit1*digit2)+carry
                carry=digit//10
                digit=digit%10
                curr_sum=str(digit)+curr_sum
            curr_sum=str(carry)+curr_sum if carry>0 else curr_sum
            for i in range(index):
                curr_sum+="0"
            max_len=max(max_len,len(curr_sum))
            index+=1
            array_to_sum.append(curr_sum)

        ans=""
        carry=0
        for i in range(max_len):
            curr_sum=carry
            for num in array_to_sum:
                num_len=len(num)
                if i>=num_len:
                    continue
                curr_sum+=int(num[num_len-i-1])
                print(curr_sum)
            ans=str((curr_sum%10))+ans
            carry=curr_sum//10

        ans=str(carry)+ans if carry>0 else ans

        return ans