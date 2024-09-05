package Rivision21_8;

public class ArrayMaxSubarray {
    //bruteforce approach
    public static void MaxSubArray(int arr[]){
        int max= Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                curr_sum =0;
                for(int k=i; k<=j; k++){
                    curr_sum += arr[k];
                }
                System.out.println(curr_sum);
                if(curr_sum> max){
                    max = curr_sum;
                }
            }
        }
        System.out.println("max value is "+max );
    }

    public static void kadansSol(int arr[]){
        int curr_sum = 0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i< arr.length; i++){
            curr_sum += arr[i];
            if(curr_sum>max){
                max=curr_sum;
            }if(curr_sum <0){
                curr_sum = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={-2,3,-4,5,6,7};
      MaxSubArray(arr);
        kadansSol(arr);

    }
}
