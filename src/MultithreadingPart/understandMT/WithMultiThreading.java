package MultithreadingPart.understandMT;

public class WithMultiThreading {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        NumberCalculator thread1 = new NumberCalculator();// use this when you are extending thread class
        SumCalculator sumC = new SumCalculator();// use this when we use runnable interface
        Thread thread2= new Thread(sumC);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("time taken : "+System.currentTimeMillis());
    }
}
