package RevisionDSABasic;

//nums[] = { 3,4,5,1,2}
public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[] ={3,4,5,6,1,2,4};
        System.out.println(printArr(arr));
    }
public static boolean printArr(int arr[]){
    int count =0;
        for(int i=0; i<arr.length-1; i++) {
        if (arr[i] > arr[i + 1]) {
            count++;
        }
    }
          if(count==0){
        return true;
    } else if (count>1) {
        return false;
    }else if (arr[0]< arr[arr.length-1]){
        return false;
    }
return true;}
}
