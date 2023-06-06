class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        maxAvg=float("-inf")
        sum_curr_window=0
        for i in range(k):
            sum_curr_window+=nums[i]
            print(nums[i])

        avg_curr_window=sum_curr_window/k
        maxAvg=avg_curr_window


        for i in range(k,len(nums)):
            sum_curr_window-=nums[i-k]
            sum_curr_window+=nums[i]
            avg_curr_window=sum_curr_window/k
            maxAvg=max(maxAvg,avg_curr_window)
        return maxAvg
