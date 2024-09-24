package MultithreadingPart;

public class BankMain {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);

            }
        };
        Thread t1 = new Thread(task, "threadOne");
        Thread t2 = new Thread(task, "ThreadTwo");
        t1.start();
        t2.start();
    }
}
