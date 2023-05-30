class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        ans_list=[]

        for interval in intervals:
            if len(ans_list)==0 or ans_list[-1][1]<interval[0]:
                ans_list.append(interval)

            else:
                ans_list[-1][1]=max(ans_list[-1][1],interval[1])

        return ans_list
#sorting takes O(logN) space
