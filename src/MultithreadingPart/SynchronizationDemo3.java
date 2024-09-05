package MultithreadingPart;



class Counter{
    private  int count= 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyNewThread extends Thread{

    private Counter c;

    MyNewThread(Counter c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i = 0; i<100000; i++){
            c.increment();
        }
    }
}
public class SynchronizationDemo3 {
    public static void main(String[] args) {
        Counter c = new Counter();
        int max = Integer.MAX_VALUE;
    MyNewThread T1 = new MyNewThread(c);
    MyNewThread T2 = new MyNewThread(c);
    T1.start();
    T2.start();
    try{
        T1.join();
        T2.join();
        }catch(Exception e){

        }
        System.out.println(c.getCount());
    }

}

