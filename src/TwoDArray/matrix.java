package TwoDArray;

import java.util.Scanner;

public class matrix {
    boolean findTraget(int matrix[][], int target ){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    System.out.println(target +"is at matrix ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("target not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length; int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        matrix mat = new matrix();
        mat.findTraget(matrix, 0);
    }
}
