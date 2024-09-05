package MultithreadingPart;

public class SetPriority {
    public static void main(String[] args) {
    Thread y = new Thread(new MyRunnable(), "thread1");
    Thread z = new Thread(new MyRunnable(), "thread2") ;

    y.setPriority(Thread.MAX_PRIORITY);
    z.setPriority(Thread.MIN_PRIORITY);

    y.start();
    z.start();

    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
          Thread thread = Thread.currentThread();
            System.out.println("thread: "+ thread.getName()+ "priority: "+ thread.getPriority() );
        }
    }
}
