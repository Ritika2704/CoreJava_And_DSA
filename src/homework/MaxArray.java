package homework;

//9.Write a program that finds and prints the maximum value in an array of integers.
public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {20,5,7,8,4};
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(max< arr[i]){
              max= arr[i];
            }
        }
        System.out.println(max);
    }
}
