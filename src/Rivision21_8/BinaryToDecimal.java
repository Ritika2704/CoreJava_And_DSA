package Rivision21_8;

class DecimalToBinary{

    public int convertToBin(int decNum){
        int binary =0;
        int pow=0;
        while(decNum>0){
            int lastDig = decNum%2;
            binary = binary + (lastDig* (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        return binary;
    }
}
public class BinaryToDecimal {
    public static void main(String[] args) {
        int binNum= 101;
        int decimal =0;
        int pow=0;

        while (binNum>0){
            int lastDig = binNum%10;
            decimal = decimal + ( lastDig* (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("binary to decimal: " +decimal);




        //decimal to binary
        int num = 5;
        DecimalToBinary d = new DecimalToBinary();
        int binary = d.convertToBin(num);
        System.out.println("decimal to binary: "+binary);

    }
}
