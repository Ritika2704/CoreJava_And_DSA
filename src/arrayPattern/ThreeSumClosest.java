package arrayPattern;

import java.util.Arrays;

class Solution1{
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[3];
        for(int i=0; i< nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left< right){
                int sum= nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)< Math.abs(closestSum-target)){
                    closestSum = sum;
                }if(sum<target) ++left;
                else if(sum>target) --right;
                else
                    return sum;
            }
        }
        return closestSum;
    }
        }
public class ThreeSumClosest {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        Solution1 s = new Solution1();
        int result = s.threeSumClosest(nums, target) ;
        System.out.println("The closest sum to " + target + " is: " + result);

    }
}
