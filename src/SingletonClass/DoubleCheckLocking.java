package SingletonClass;

//The obj variable is declared as volatile.
//This ensures that any write to obj is visible to all threads, and no thread will cache the value locally.

public class DoubleCheckLocking {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            DoubleCheckConn newObj = DoubleCheckConn.getInstance();
            System.out.println(" t1: "+ newObj);
        });

        Thread t2 = new Thread(()-> {
            DoubleCheckConn obj2 = DoubleCheckConn.getInstance();
            System.out.println(" t2: "+ obj2);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

class DoubleCheckConn {
    private static volatile DoubleCheckConn obj;

    private DoubleCheckConn(){
    }
    public static DoubleCheckConn getInstance(){
        if(obj == null){
            synchronized (DoubleCheckConn.class){
                if(obj == null){
                    obj = new DoubleCheckConn();
                }
            }
        }
        return obj;
    }
}
