package arrays;

public class Program4 {
    public static int binarySearch(int arr[], int key){
        int start =0; int last= arr.length-1;

        while(start<=last){
            int mid= (start+last)/2;

            if(arr[mid] == key){//found
               return mid;
            }
            if(arr[mid] >key){//left
               last = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        int key = 8;
        System.out.println("index of key is " + binarySearch(arr, key) );
    }
}
