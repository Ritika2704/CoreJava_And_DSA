package Rivision21_8;

public class ArrayPairs {
    public void PrintPair(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" +arr[i] +","+ arr[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,4,6,8};
        ArrayPairs p= new ArrayPairs();
        p.PrintPair(arr);
    }
}
