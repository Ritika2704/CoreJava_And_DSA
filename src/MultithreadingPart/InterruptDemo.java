package MultithreadingPart;

public class InterruptDemo extends Thread {

    InterruptDemo(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("hello");
        try{
            Thread.sleep(1000);
            System.out.println("thread is running ");
        }catch (Exception e){
            System.out.println("Thread Interrupted" +e);
        }
    }

    public static void main(String[] args) {
        InterruptDemo i = new InterruptDemo("t1");
        i.start();
       i.interrupt();
    }
}
