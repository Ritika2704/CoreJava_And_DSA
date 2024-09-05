package patterns;

public class pattern_7 {
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for( int star=1; star<=n; star++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    solid_rhombus(5);
    }
}
