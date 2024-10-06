package RevisionDSABasic;

public class Anagram {
    public static void main(String[] args) {

        String s = "anagaram";
        String t = "graamant";
        System.out.println(checkAnagram(s, t));
    }
    public static boolean checkAnagram(String s, String t){

        int first = s.length();
        int second = t.length();

        if(first != second){
            return false;
        }else{
            int count[] = new int[26];
            for(int i =0; i<first; i++){
                count[s.charAt(i) - 'a']++;
            }
            for(int j = 0; j<second; j++){
                count[t.charAt(j)- 'a']--;
            }

            for(int k =0; k<count.length; k++){
                if(count[k] !=0 ){
                    return false;
                }
            }
        }
        return true;

    }

}
