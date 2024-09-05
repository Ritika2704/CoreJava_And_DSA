package Rivision21_8;
//linear search----> O(n)
public class ArrayLinear {
    public int linearSearch(int []arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,6,8,10,12,14};
        int target = 10;
        ArrayLinear a = new ArrayLinear();
        int res =a.linearSearch(arr, target);
        if(res == -1){
            System.out.println(target +" element not found");
        }else{
            System.out.println(target +" is at " + res+ " position.");
        }
    }
}
