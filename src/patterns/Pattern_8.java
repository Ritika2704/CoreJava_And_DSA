package patterns;

public class Pattern_8 {
    public static void diamond(int n) {
        //upper part
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=(2*i)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=(2*i)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    diamond(5);
    }
}
