package RevisionDSABasic;

public class PairsInArray {
    public static void main(String[] args) {
     int arr[] = {2,8,3,2,5,6,4};
     PrintPairs(arr);
    }

    public static void PrintPairs(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j= i+1; j< arr.length; j++){
                System.out.print( " ("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
}
