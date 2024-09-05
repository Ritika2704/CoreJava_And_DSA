package TwoDArray;

public class DiagonalSum {
    public static int DiagonalSum(int nums[][]){
        int sum =0;
        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(i==j){
                    sum += nums[i][j];
                }else if(i+j == nums.length-1){
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }

    public static int Optimised(int matrix[][]){
        int sum= 0;
        for(int i=0; i< matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i!= matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {{2,3,4,5,6},
                {6,7,9,50,4},
                {12,13,14,15,16},
                {21,22,23,24,25},
                {31,32,33,34,35}};
        System.out.println(DiagonalSum(matrix));
        System.out.println(Optimised(matrix));
    }
}
