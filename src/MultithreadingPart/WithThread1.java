package MultithreadingPart;
//here i am making basic thread by using Thread also setting the name and deamon thread also

class ThreadF extends Thread{
    ThreadF(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            System.out.println("printing "+ Thread.currentThread()+ " "+ i);
        }
    }
}
class ThreadS implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<10; i++){
            System.out.println("hello "+i+ " "+Thread.currentThread());
        }
    }
}
public class WithThread1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("main thread start ");
        Thread t1 = new ThreadF("threadOne"); //this done when we want implement using Thread
        Thread t2 =  new Thread(new ThreadS(), "threadTwo");//this done when we want implement using Runnable
        t1.start();
//        t2.setDaemon(true);//must place it before calling it.
        t2.start();
        t1.join();

        System.out.println("main thread exit ");
    }
}
