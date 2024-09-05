package arrayPattern;

import java.util.*;

class solution{
    public List<List<Integer>>threeSum(int[] nums){
        if(nums ==null || nums.length <3)return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i< nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left< right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum ==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left<right && nums[left] == nums[left-1]) left++;
                    while (left<right && nums[right] == nums[right+1]) right--;

                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
public class ThreeSum {
    public static void main(String[] args) {
       int []nums = {-1, 0,1,2,-1,4};
        solution s= new solution();
        List<List<Integer>> result = s.threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
