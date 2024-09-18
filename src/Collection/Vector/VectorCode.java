package Collection.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        for(int i=0; i<5; i++){
            vec.add(i*5);
        }
//            System.out.print(vec);

        //use of enumeration
        System.out.println("Print Vector: ");
        Enumeration<Integer> en = vec.elements();
        while(en.hasMoreElements()){
            int x= en.nextElement();
            System.out.println(x);
        }

    }
}
