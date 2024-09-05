package Homework2;

import java.util.Scanner;

/**Q-1) Write a java program to read shoes brand name from keyboard, based on brand
        name print brand slogan like below Nike -> Just do it
        Adidas -> Impossible is nothing Puma -> Forever Faster
        Reebok -> I Am What I Am

 Q-2) Write a java program to read person basic salary and calculate Provident Fund
 amount from the basic salary Formula: Provident Fund is 12 % of Basic Salary

 Q-3) Write a java program to read person age and person salary and print his eligibility for marriage
 Condition: If person age less than 30 and salary greater than 1 lakh then eligible for marriage

 Q-4) Write a java program to find factorial of given number

 Q-6) Write a java program to print numbers from 100 to 1
 Q-7) Write a java program to find sum of 1 - 100 numbers
 Q-9) Write a java program to check given number is Armstrong number or not
 Q-10) Write a java program to print first 100 prime numbers

 **/

public class LogicalProblem {
    public static void question1(String brand){
    switch(brand){
        case "Nike":
            System.out.println("Just do it!");
        break;
        case "Adidas":
            System.out.println("Impossible is nothing!");
        break;
        case "Puma":
            System.out.println("Forever Faster!");
        break;
        case "Reebok":
            System.out.println("I Am What I Am!");
            break;
        default:System.out.println("Not valid brand");
    }
    }

    public static int question2(int salary){
        int Pf= salary*12/100;
        return Pf;
    }

    public static void question3(int age, int salary){
        if(age< 30 && salary> 100000){
            System.out.println("Eligible for marriage");
        }else{
            System.out.println("Not Eligible for marriage");
        }
    }

    public static int question4(int n){
        int fact =1;
        for(int i=1; i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void question6(){
        int n =100;
        while(n>0){
            System.out.print(n+" ");
            n--;
        }
    }

    public static void question7(){
        int n =1;
        int sum=0;
        while(n<=100){
             sum = sum+n;
            n++;
        }
        System.out.print(sum+" ");
    }

    public static boolean question10(int n){

        if(n==2 ){
            return true;
        }else {
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i ==0){
                    return false;
                }
            }
        }
        return true;
    }
    //print print in range
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(question10(i)){ //true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        System.out.print("Enter your Salary: ");
//        String brand = sc.nextLine();
//        question1(brand);
//        int salary = sc.nextInt();
////        System.out.println(question2(salary));
//        question3(age, salary);

//        System.out.print("Enter your number: ");
//        int num = sc.nextInt();
//        System.out.println(question4(num));
//        question6();
//        question7();
        primeInRange( 100);
    }
}
