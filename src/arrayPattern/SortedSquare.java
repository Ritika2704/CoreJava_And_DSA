package arrayPattern;

class Solution3{
    public int [] sortedSquare(int[] nums){
        int left =0;
        int right = nums.length-1;
        int res[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if (Math.abs(nums[left])>Math.abs(nums[right])){
                res[i] = nums[left]* nums[left];
                left++;
            }else {
                res[i] = nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
}
public class SortedSquare {
    public static void main(String[] args) {
        int nums[] ={-7,-3,2,3,11};
        Solution3 s= new Solution3();
        int res[] = s.sortedSquare(nums);
        for(int sorted: res){
            System.out.print(sorted+ " ");
        }
    }
}
