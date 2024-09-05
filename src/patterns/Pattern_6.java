package patterns;

public class Pattern_6 {
    public static void butterfly(int n){
        //upper part
        for(int i=1; i<=n; i++){
            //star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            //space
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--){
            //star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            //space
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    butterfly(5);
    }
}
