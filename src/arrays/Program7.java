package arrays;

public class Program7 {
    public static void printSubArray(int arr[]){
        int ts =0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray= "+ts);
    }
    public static void main(String[] args) {
        int[] arr= {2,5,8,9,1};
        printSubArray(arr);
    }
}
