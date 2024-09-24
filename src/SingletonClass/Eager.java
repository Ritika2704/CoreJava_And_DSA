package SingletonClass;
// Singleton class - the objective to create only one object.

//1 Eager Initialisation - in this we make object in advance
public class Eager {
    public static void main(String[] args) {
        DbConnection conObject = DbConnection.getInstance();
        System.out.println("DbConnection object created: " + conObject);
    }
}

class DbConnection{

    private final static DbConnection ConObj = new DbConnection();
// private= don't want anyone to access apart from this class
//final= make it immutable
//static = this is now directly related to the class not related to object
    //it is preloaded to the memory

    //make it private as no one can access this constructor by creating new keyword
    private DbConnection(){
    }

   // by this public method, if any one want to call the obj they call the method (static because they can call by class name directly
    public static DbConnection getInstance(){
        return ConObj;
    }
}

//