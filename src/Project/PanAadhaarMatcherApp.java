package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();
        try {
            System.out.println("Enter your Aadhaar Number");
            String Aadhaarnum = sc.nextLine();

            if (Aadhaarnum.isEmpty()) {
                throw new IllegalArgumentException("Aadhaar number can not be empty");
            }

            Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(Aadhaarnum);
            Pan pan = panService.getPanByAadhaarNum(Aadhaarnum);


            if (aadhaar != null && pan != null) {
                System.out.println("Aadhaar Details :" + aadhaar);
                System.out.println(("Pan Details: " + pan));
            } else if(aadhaar != null){
                System.out.println((" We Found Only Aadhaar Details: "+ aadhaar));
            }
            else {
                throw new NoMatchFoundException("Error: No Match Found ");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }catch (Exception e){
            System.out.println( e.getMessage());
        }finally {
            sc.close();
        }
    }
}
