package MultithreadingPart;



class YeildChild implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}

class YeildChild2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
            Thread.yield();
        }
    }
}

public class yeildDemo {
    public static void main(String[] args) {
    Thread yld1 = new Thread(new YeildChild(), "child1");
    Thread yld2 = new Thread(new YeildChild2(), "child2");
    yld1.start();
    yld2.start();

    for(int i =0; i<6; i++){
        System.out.println(Thread.currentThread().getName());

    }
    }
}
