package arrays;

public class Program6 {
    public static void arrayPair(int arr[]){
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+current+","+ arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,5,6};
        arrayPair(arr);
    }
}
