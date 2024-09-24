package MultithreadingPart;

public class LessImpletation {
    public static void main(String[] args) {
        Thread t = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+ " , "+i);
            }
        });
        t.start();

        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread()+ " , "+i);
            }
        });
        t2.start();
    }
}
