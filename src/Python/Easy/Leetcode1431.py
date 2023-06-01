class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        highest_num_of_candies=0
        for candy in candies:
            highest_num_of_candies=max(highest_num_of_candies,candy)

        ans=[]
        for candy in candies:
            if candy+extraCandies>=highest_num_of_candies:
                ans.append(True)

            else:
                ans.append(False)

        return ans