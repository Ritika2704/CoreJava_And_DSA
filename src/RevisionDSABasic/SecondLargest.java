package RevisionDSABasic;

public class SecondLargest {
    public static void main(String[] args) {
 int arr[]= {12, 35, 1, 10, 34, 1};
        System.out.println(PrintSecLargest(arr));
    }

    public static int PrintSecLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if(arr[i]> max){
                secMax = max;
                max = arr[i];
            } else if (arr[i] >secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        if (secMax == Integer.MIN_VALUE){
            return -1;
        }
        return secMax;
    }
}
