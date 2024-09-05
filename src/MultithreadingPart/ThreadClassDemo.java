package MultithreadingPart;
/** there are two ways we can do multithreading -- 1) By extending thread class
 * here we create our thread class first then extends parent thread class and in that we have to overwrite the run() method
 * and add how the execution of a thread.
 * **/

class MyThread extends Thread{
    //defining the thread
    @Override
    public void run() {
        for (int i=0; i<=10; i++){
            System.out.println("child thread" +i);
        }
    }
}
public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread a = new MyThread(); //initialization of a thread
        a.start(); //starting of a thread
       // a.run();
        // every time there will be different output because It depends on threadScheduler when it gives time to run/ or we can say cpu any thread
        for(int i=0; i<5; i++){
            System.out.println("main thread" +i);
        }
    }
}
