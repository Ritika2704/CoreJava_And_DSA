package homework;

//5.Write a program that initializes an array of 5 integers and prints each element using a loop.
public class PrintArray {
    public static void main(String[] args) {
//        int arr[] = new int[5];
        int[] arr = {2,4,5,6,7};
        // for each loop
        for (int x:arr){
            System.out.println(x);
        }
    }
}
