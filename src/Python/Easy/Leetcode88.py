class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1=m-1
        ptr2=n-1
        ptr=m+n-1

        while ptr2>=0:
            if ptr1<0 or nums1[ptr1]<=nums2[ptr2]:
                nums1[ptr]=nums2[ptr2]
                ptr-=1
                ptr2-=1
            else:
                nums1[ptr]=nums1[ptr1]
                ptr-=1
                ptr1-=1
