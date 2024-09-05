package arrays;

public class Program8 {
    public static void sumSubArray(int arr[]){
        int currSum= 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length;j++){
                int end=j;
                currSum=0;
                for (int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(max<currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("max sum "+max);
    }
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10};
       sumSubArray(arr);
    }
}
