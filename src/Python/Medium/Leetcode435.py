class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals=sorted(intervals,key=lambda x: x[1])
        erasedOverlapList=[]
        print(intervals)
        for i,interval in enumerate(intervals):
            if i==0 or interval[0]>=erasedOverlapList[len(erasedOverlapList)-1][1]:
                erasedOverlapList.append(interval)
        print(erasedOverlapList)
        return len(intervals)-len(erasedOverlapList)