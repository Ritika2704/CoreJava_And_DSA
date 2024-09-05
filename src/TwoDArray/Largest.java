package TwoDArray;

import java.util.Scanner;

public class Largest {
    public static void matrix(int nums[][]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.println("Enter your number: ");
                Scanner sc = new Scanner(System.in);
                nums[i][j] = sc.nextInt();
            }
        }
        //print
        for(int i =0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void largest(int nums[][]){
        int largestnum = Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if (nums[i][j] > largestnum){
                    largestnum = nums[i][j];
                }
            }

        }
        System.out.println("largest num " +largestnum);
    }
    public static void main(String[] args) {
        int nums[][]= new int [3][3];
        matrix(nums);
        largest(nums);
    }
}
