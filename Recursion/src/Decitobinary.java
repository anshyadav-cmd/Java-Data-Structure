public class Decitobinary {
    public static void main(String[] args) {
        System.out.println(dToB(11));
    }
    public static int dToB(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 1) {
            return 1;
        }
        return n%2 + 10*(dToB(n/2));
    }
}
