package arrays;

import java.util.SortedMap;

public class Program3 {
    public static int largestnum(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(largest< arr[i]){
                largest = arr[i];
            }
            if(smallest> arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is " + smallest  );
        return largest;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,7,2,9,4};
        System.out.println("the largest number is: "+ largestnum(arr));
    }
}
