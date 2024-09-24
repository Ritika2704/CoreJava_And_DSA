package MultithreadingPart;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance =100;
   private final Lock lock = new ReentrantLock(true);

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+ " attempting to withdraw "+ amount);
        try {
            if (lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdraw ");
                        Thread.sleep(600);
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawl is completed the remaining balance is " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " not able to acquired the lock will try again later! ");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}






// with synchronization
//public class BankAccount {
//    private int balance =100;
//
//    public synchronized void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName()+ " attempting to withdraw "+ amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName()+ " proceeding with withdraw ");
//            try {
//                Thread.sleep(600);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            balance = balance-amount;
//            System.out.println(Thread.currentThread().getName()+ " withdrawl is completed the remaining balance is " + balance);
//        }else
//            System.out.println(Thread.currentThread().getName()+ " insufficient balance ");
//    }
//}
