package StringQuestions;

public class ShortestPath {
    public static float PrintShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i< path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 +y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(PrintShortestPath(path));

    }
}
