package RevisionDSABasic;

public class BuySellPrice {
    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
//        System.out.println(ProfitLoss(Prices));
    }

    //Max profit kab hoga voh btana h
    public static int ProfitLoss(int arr[]){
      int buyPrice = Integer.MAX_VALUE;
      int maxProfit = 0;
      for(int i =0; i< arr.length; i++){
        if(buyPrice< arr[i]){
            int profit =  arr[i]-buyPrice;
            maxProfit= Math.max(maxProfit, profit);
        }else {
            buyPrice = arr[i];
        }
      }
      return maxProfit;
    }


    //you have input array and have to tell on which day it has maximum and which day minimum stock price.


}
