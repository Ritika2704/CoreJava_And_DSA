package arrays;

public class Program8_2 {
    public static void kadanes(int arr[]){
        int max= Integer.MIN_VALUE;

        int cs = 0;


        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs>max){
                max = cs;
            }
            if (cs<0){
                cs = 0;
            }
            System.out.println(max);
        }
        System.out.println("max is: "+ max );
    }

    public static void main(String[] args) {
//       int num[] = {-2,-3,4,-1,-2,1,5,-3};
       int num[] = {-1,-2,-3,-4};
        kadanes(num);
    }
}
