public class Fibonacci {
    public static void main(String[] args) {
        long fib=fibonacci(7);
        System.out.println("fibonacci value is " + fib);
    }

     public static long fibonacci(int n){
        if(n<=2) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
     }
}
