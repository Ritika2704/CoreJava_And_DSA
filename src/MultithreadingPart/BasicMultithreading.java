package MultithreadingPart;

public class BasicMultithreading extends Thread{
    @Override
    public void run() {
       System.out.println("Hi how are you ");
        for (int i=1; i<=5; i++){
            System.out.print("hello ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+" friend");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BasicMultithreading b = new BasicMultithreading();
        b.start();
        System.out.println("---");
        b.join();
        System.out.println("we are finally here :)");
    }
}
