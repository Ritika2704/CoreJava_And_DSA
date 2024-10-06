package RevisionDSABasic;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadansAlgo(arr));
    }
    public static int kadansAlgo(int arr[]){
        int curr_sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++){
            curr_sum += arr[i];
            if(curr_sum> max){
                max = curr_sum;
            }
            if(curr_sum <0){
                curr_sum =0;
            }
        }
        return max;
    }
}
