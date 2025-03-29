package MultithreadingPart.understandMT;

public class NumberCalculator extends Thread{
    @Override
    public void run() {
        int count =0;
        for(int i=1; i<=50000000;i++){
            if(i%10==7){
                count++;
            }
        }
        System.out.println("Count of number end with 7 = "+ count);
    }
}
