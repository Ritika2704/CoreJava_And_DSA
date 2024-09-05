package MultithreadingPart;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello World!");
        }
    }

    public static void main(String[] args) {
        DaemonThread d = new DaemonThread();
        d.setDaemon(true);
        d.start();
        System.out.println("main done");
    }
}
