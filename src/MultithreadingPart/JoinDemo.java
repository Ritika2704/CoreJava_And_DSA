package MultithreadingPart;



class JoinChild implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Let's meet and call Friend "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread j1 = new Thread(new JoinChild());
        j1.start();
        j1.join(100);
        System.out.println("We are here let's party now!!");
    }
}
