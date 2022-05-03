import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    public static void main(String[] args) {
        long fib=dpfibonacci(7);
        System.out.println("fibonacci value is " + fib);
    }

    public static long dpfibonacci(int n){
        Map<Integer,Integer> map=new HashMap();
        long fib=fibonacci(n,map);
        return fib;
    }

    public static long fibonacci(int n,Map<Integer,Integer> map){
        if (map.containsKey(n)){
            return map.get(n);
        }
        if(n<=2) {
            return 1;
        }
        return fibonacci(n-1,map)+fibonacci(n-2,map);
    }
}
