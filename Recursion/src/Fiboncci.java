public class Fiboncci {
    public static void main(String[] args) {
        Fiboncci fibo = new Fiboncci();
        int fib = fibo.fiboncci(10);
        System.out.println(fib);
    }
    public int fiboncci(int n){
        if(n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fiboncci(n-1) + fiboncci(n-2);
    }
}