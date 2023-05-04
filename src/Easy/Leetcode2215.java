package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode2215 {
    public List<Integer> findDifferenceWithFirstArray(int[] nums1, int[] nums2){
        Set<Integer> nums1Set=new HashSet<>();
        Set<Integer> nums2Set=new HashSet<>();
        for(int num2:nums2){
            nums2Set.add(num2);
        }
        for(int num1:nums1){
            if(!nums2Set.contains(num1)){
                nums1Set.add(num1);
            }
        }
        return new ArrayList<>(nums1Set);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> listA=findDifferenceWithFirstArray(nums1,nums2);
        List<Integer> listB=findDifferenceWithFirstArray(nums2,nums1);
        ans.add(listA);
        ans.add(listB);
        return ans;
    }
}
