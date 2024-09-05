package arrays;

public class Program2 {
    public static int menu(String menulist[], String key){
        for(int i=0; i<=menulist.length; i++){
            if(menulist[i] == key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        String menuList[] = {"samosa", "breadPakoda", "Frooty","dokla" };
        String key = "Frooty";
        int index = menu(menuList, key);
        if(index ==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key is at index: "+index);
        }
    }
}
