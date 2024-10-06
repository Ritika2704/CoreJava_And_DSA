package RevisionDSABasic;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int key = 3;
        System.out.println(Search(arr, key));
    }
    public static int Search(int arr[], int target ){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return target;
            } else if (arr[mid] > target) {
                j= mid-1;
            }else {
                i= mid+1;
            }
        }
        return -1;
    }
}
