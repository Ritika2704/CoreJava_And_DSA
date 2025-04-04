package MultithreadingPart;
/** there are two ways we can do multithreading -- 2) By implementing Runnable interface
 *
 * **/
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<10; i++){
            System.out.println("child thread " +i);
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();
        for (int i =0; i<5; i++){
            System.out.println("main thread" +i);
        }
    }
}
