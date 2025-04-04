package MultithreadingPart;


class table {
    synchronized void printTable(int n){
        for(int i=0; i<5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    table t;
    MyThread1 (table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    table t;
    MyThread2 (table t){
        this.t =t;
    }
    public void run(){
        t.printTable(12);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        table obj = new table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
