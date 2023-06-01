class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        prev=-1
        count_zero=0

        for i,has_flower in enumerate(flowerbed):
            if has_flower==0:
                count_zero+=1
            else:
                if prev==-1:
                    n-=count_zero//2

                else:
                    n-=(count_zero-1)//2

                count_zero=0
                prev=i


            if n<=0:
                return True

        n-=count_zero//2 if prev!=-1 else (count_zero+1)//2

        return n<=0