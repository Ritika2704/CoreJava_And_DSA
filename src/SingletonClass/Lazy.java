package SingletonClass;

public class  Lazy {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            DbConnection1 conObject = DbConnection1.getInstance();
            System.out.println("Thread 1: " + conObject);
        });

        Thread thread2 = new Thread(()-> {
            DbConnection1 obj = DbConnection1.getInstance();
            System.out.println("Thread 2: "+ obj);
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            Thread.currentThread().getName();
        }


    }
}

 class DbConnection1{
    public static DbConnection1 obj;

    private DbConnection1(){
    }

    public static DbConnection1 getInstance(){
        if (obj == null){
            obj = new DbConnection1();
        }
        return obj;
    }
}

//here thread will check if the obj is null or not if it is null,
//we'll create a new object and obj reference has been assigned to it
//but there is a issue that when two thread comes in parallel both will try to access the obj that will create the issue
//at time two obj will created
//        to overcome the issue we can use synchronized that will solve the issue but makes it slow

class DbConnectionSync{
    public static DbConnectionSync obj;

    private DbConnectionSync(){
    }

    synchronized public static DbConnectionSync getInstance(){
        if (obj == null){
            obj = new DbConnectionSync();
        }
        return obj;
    }
}