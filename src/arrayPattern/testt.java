package arrayPattern;
//
public class testt {
    public static void main(String[] args) {
        int nums[] = { 3,4,5,1,2};
        System.out.println(findSecondHig(nums));

    }
    public static int findSecondHig(int[] nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: nums){
            if(num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("no second high");
        }
        return secondMax;
    }
}

// select distinct salary from emp order by salary desc Limit 1 offset 1;

