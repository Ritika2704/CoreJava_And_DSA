package functions;

public class sumOfDivisors {
    static Long sum(int N){
        Long k = (long)0;
        for(int i=1; i<=N; i++){
            k += (N/i)*i;
        }
        return k;
    }
    public static void main(String[] args) {
        int N=4;
        System.out.println(sum(N));
    }
}
