package Collection.Vector;

import java.util.Vector;

  class MainVector {
    static Vector<Integer> v = new Vector<>();
}
class First extends Thread{
    @Override
    public void run() {
        for(int i=0; i<100000; i++){
            MainVector.v.add(i);
        }
    }
}
class Second extends Thread{
    @Override
    public void run() {
        for(int i=0; i<100000; i++){
            MainVector.v.add(i);
        }
    }
}
public class ThreadVector {
    public static void main(String[] args) throws Exception {
        First f = new First();
        Second s = new Second();
        f.start();
        s.start();
        f.join();
        s.join();
        System.out.println("Vector Size: "+ MainVector.v.size());
    }
}