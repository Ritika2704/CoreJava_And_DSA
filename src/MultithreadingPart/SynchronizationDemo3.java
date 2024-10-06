package MultithreadingPart;

// this counter class access by the multiple thread without synchronized there race condition occur
// pehle hmne counter bnaya usme ek count rakha and fir increment method me count++ kr rhe h
// and the get count se value return krva denge
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
// The constructor takes a Counter object as a parameter and assigns it to the instance variable c.
// This ensures that multiple threads will share the same Counter object,
// leading to concurrent access to its increment method.
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

    MyNewThread T1 = new MyNewThread(c);
    MyNewThread T2 = new MyNewThread(c);
    T1.start();
    T2.start();
    //join hmne esliye use kra h kyuki main end ho jaayega hmare pass exect result nhi aayega
        //join k vjh main thread wait kregi jab tak t1, t2 complete nah ho jaaye
    try{
        T1.join();
        T2.join();
        }catch(Exception e){
        }
        System.out.println(c.getCount());
    }

}

