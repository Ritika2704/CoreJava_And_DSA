package Rivision21_8;
//Binary search ---> prerequisite sorted array
// time complexity -> O(log n) - in this we find the mid of an array then take two variables to iterate
// first from starting and second one from the end and applied the condition that first should be smaller and equal to last
public class ArrayBinary {
    public int binarySearch(int arr[], int key ){
        int i= 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]< key){
                i= mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] = {2,4,6,8,10,12};
         int key = 8;
         ArrayBinary b = new ArrayBinary();
         int res = b.binarySearch(arr, key);
        if(res == -1){
            System.out.println(key +" element not found");
        }else{
            System.out.println(key +" is at " + res+ " position.");
        }
    }
}
