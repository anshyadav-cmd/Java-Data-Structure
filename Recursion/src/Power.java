public class Power {
    public static void main(String[] args) {
        System.out.println(power(4,2 ));
    }
    public static int power(int v, int n){
        if(n < 0){
            return -1;
        }
        if(n == 0) {
            return 1;
        }
        return v * power(v , n-1);
    }
}
