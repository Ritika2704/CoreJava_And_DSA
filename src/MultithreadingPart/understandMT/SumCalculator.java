package MultithreadingPart.understandMT;

public class SumCalculator implements Runnable{
    @Override
    public void run() {
int sum = 0;
for (int i =1 ; i<=1000000; i++){
    sum+=i;
}
        System.out.println(" Sum: "+ sum);
    }
}
