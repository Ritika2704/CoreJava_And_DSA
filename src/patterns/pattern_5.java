package patterns;

public class pattern_5 {
    public static void invertedRotatedTri(int row){
        for(int i=1; i<=row; i++){
            //spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void invertedHalfPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int row){
        int num=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }

    public static void numPyramid(int row){
        for(int i=1; i<=row; i++ ){
            //space
            for(int j=1; j<=row-i; j++ ){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print( i+" ");
            }
            System.out.println();
        }
    }

    public static void _01Triangle(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++ ){
                if((i+j)%2 ==0){
                    System.out.print("1");
                }else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void palindromePyramid(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        invertedRotatedTri(5);
//        invertedHalfPyramid(5);
//        floydTriangle(5);
//        _01Triangle(5);
//        numPyramid(5);
        palindromePyramid(5);
    }
}
