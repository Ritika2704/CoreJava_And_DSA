package SingletonClass;

// in this initialization part it is just put it inside nested class it do not get loaded at the time of starting the application.
//all the nested call do not get loaded into the memory they invoked only when they are referred
//when they are in use then only we load it that's the property of the nested class.
public class BillPughSol {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            Connection conObj = Connection.getInstance();
            System.out.println("T1: "+ conObj);
        });

        t1.start();
    }
}

class Connection{
    private Connection(){
    }
    private static class NestedConnection{
        private final static Connection Instance_obj = new Connection();
    }
    public static Connection getInstance(){
        return NestedConnection.Instance_obj;
    }
}
