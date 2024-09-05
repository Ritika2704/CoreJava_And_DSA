package Rivision21_8;

public class ArrayRev {
    public void ReverseArray(int arr[]){
        int i=0, j = arr.length-1;
        while(i<j){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
    }

    public int[] ReverseArrPart2(int arr[]){
        int j=0;
        int res[] = new int[arr.length];
        for(int i= arr.length-1; i>=0; i--){
            res[i] = arr[j];
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= { 2,4,6,8,10};
        ArrayRev rev = new ArrayRev();
//        rev.ReverseArray(arr);
       int revArray[] = rev.ReverseArrPart2(arr);
        for(int x: revArray){
            System.out.print(x +" ");}
    }
}
