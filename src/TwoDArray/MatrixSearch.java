package TwoDArray;

public class MatrixSearch {
    public static boolean sortedMatrix(int num[][], int target){
        int row= 0; int col = num[0].length-1;
        while(row<num.length && col>=0){
            if(num[row][col] == target){
                System.out.println(target +" is found on (" + row+","+ col+")");
                return true;
            }else if(target< num[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("target not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int target = 33;
        sortedMatrix(matrix, target);
    }
}
