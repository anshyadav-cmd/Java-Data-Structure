public class Factorial {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        var rec = fac.factorial(3);
        System.out.println(rec);
    }
    public long factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if (n == 0 | n == 1) {
            return 1;
        }
       return n * factorial(n-1);
    }
}
