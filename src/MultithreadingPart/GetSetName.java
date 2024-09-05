package MultithreadingPart;



public class GetSetName {
    public static void main(String[] args) {
        //creating a new thread
        Thread t = new Thread(new MyRunnable());
        t.start();

        //getting the default value
        String DefaultName = t.getName();
        System.out.println("Default name of the Thread "+ DefaultName);

        //setting the value of the thread
        t.setName("MyThread");

        //now getting the updated value
        String UpdatedName = t.getName();
        System.out.println("Updated name of the thread " + UpdatedName);
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
             for(int i=0; i<5; i++){
                 System.out.println("Thread is running");
             }
        }
    }
}
