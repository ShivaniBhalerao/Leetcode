package Easy;

import java.util.Arrays;

//Referred Approach 2 LC. Also chcek and read more about its space complexity.
public class Leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptr1=0;
        int ptr2=0;
        int k=0;
        while(ptr1<nums1.length && ptr2<nums2.length){
            if(nums1[ptr1]<nums2[ptr2]){
                ptr1++;
            }
            else if(nums1[ptr1]>nums2[ptr2]){
                ptr2++;
            }
            else{
                nums1[k]=nums1[ptr1];
                k++;
                ptr1++;
                ptr2++;
            }
        }

        return Arrays.copyOfRange(nums1,0,k);
    }
}
