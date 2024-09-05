package homework;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,5};

        for(int original:arr){
            System.out.print(original+ " ");
        }
        System.out.println();
        //reverse the array by swapping
        int n= arr.length;
        System.out.println(n/2);
        for(int i =0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for(int reverse:arr){
            System.out.print(reverse+ " ");
        }
    }
}
