package RevisionDSABasic;

public class MAxSubArraySum {
    public static void main(String[] args) {
 int arr[] = {2,4,6,8,10};
 PrintSubArraySum(arr);
    }
    public static void PrintSubArraySum(int arr[]){
        int currSum =0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j = i; j<arr.length; j++){
                int last =j;
                currSum =0;
                for(int k = start; k<= last; k++ ){
                    currSum += arr[k];
                }
                System.out.println("currSum: "+ currSum);
                if( currSum> MaxSum){
                    MaxSum = currSum;
                }

            }
        }
        System.out.println("MAxSum "+ MaxSum);
    }
}
