package arrays;

import homework.ReverseArray;

public class Program5 {
    public static void reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first< last){
            int temp = arr[first];
            arr[first]= arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,87,56,5,9};
        reverseArray(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
