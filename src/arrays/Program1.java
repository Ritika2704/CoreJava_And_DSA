package arrays;

public class Program1 {
    public static int linerSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        int key =4;
        int index = linerSearch(arr, key);
        if (index == -1){
            System.out.println("Key not found");
        }else {
            System.out.println("key is at index: "+ index);
        }
    }
}
