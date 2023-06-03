#Try LC greedy approach
class Solution:
    def partitionLabels(self, s: str) -> List[int]:

        pos_tracker=dict()

        for i,char in enumerate(s):
            if char in pos_tracker:
                pos_tracker[char][1]=i
            else:
                pos_tracker[char]=[i,i]

        max_pos=pos_tracker[s[0]][1]
        curr=0
        prev=0
        ans=[]
        while curr<len(s):
            if max_pos<curr:
                max_pos=pos_tracker[s[curr]][1]
                ans.append(curr-prev)
                prev=curr
            else:
                max_pos=max(max_pos,pos_tracker[s[curr]][1])

            curr+=1

        ans.append(curr-prev)

        return ans