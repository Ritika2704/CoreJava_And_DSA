package MultithreadingPart;


class Sender{
    public void send(String msg){
        System.out.println("Sending\t" +msg);
        try{
            Thread.sleep(800);
        }catch (Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println("\n" +msg+ "send");
    }
}

class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    ThreadSend(String m, Sender obj){
        msg = m;
        sender = obj;
    }
    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}
public class SynchronizationDemo2 {
    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadSend s1 = new ThreadSend(" Hi ", send);
        Thread s3= new ThreadSend("wating", send);
        ThreadSend s2 = new ThreadSend(" bye ", send);

        s1.start();
        s3.start();
        s2.start();

        try{
            s1.join();
            s2.join();
        }catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}
