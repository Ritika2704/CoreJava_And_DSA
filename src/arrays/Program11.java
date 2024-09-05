package arrays;

import java.util.HashMap;
import java.util.HashSet;


//Q Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class Program11 {
    public boolean valueCount(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean optimisedApproach(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        } return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,6,7,3};
        Program11 pro = new Program11();
//        System.out.println(pro.valueCount(nums));
        System.out.println(pro.optimisedApproach(nums));
    }
}
