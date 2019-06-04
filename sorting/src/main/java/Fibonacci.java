import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Programs to print fibonacci for given input n");

        System.out.println("10 fibo numbers with printFibotwoPowerNFiboAlgo :"+ printFibotwoPowerNFiboAlgo(10));


        System.out.println("10 fibo numbers with printFibobigOnFiboAlgo     :"+ printFibobigOnFiboAlgo(10));





    }

    private static List<Integer> printFibobigOnFiboAlgo(int n) {
        int [] memo = new int [n+1];
        List<Integer> fiboArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fiboArray.add(fibobigOnFiboAlgo(i,memo));
        }
        return fiboArray;

    }

    private static Integer fibobigOnFiboAlgo(int i, int[] memo) {
        if(i==0 || i==1){
            return i;
        }else if(memo[i]>0)
            return memo[i];
        memo[i] = fibobigOnFiboAlgo(i-1,memo)+fibobigOnFiboAlgo(i-2,memo);
        return memo[i];

    }


    private static List<Integer> printFibotwoPowerNFiboAlgo(int n) {
        List<Integer> fiboArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fiboArray.add(fibotwoPowerNFiboAlgo(i));
        }
        return fiboArray;

    }

    private static int fibotwoPowerNFiboAlgo(int i) {
        if(i==0 || i==1){
            return i;
        }else{
            return fibotwoPowerNFiboAlgo(i-1)+fibotwoPowerNFiboAlgo(i-2);
        }

    }
}
