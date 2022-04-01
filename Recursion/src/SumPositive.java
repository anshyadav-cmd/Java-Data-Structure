public class SumPositive {
    public static void main(String[] args) {
        SumPositive sumPositive = new SumPositive();
        var value = sumPositive.sumSeries(10);
        System.out.println(value);
        value = sumPositive.sumDigit(1002111);
        System.out.println(value);
    }
    public int sumSeries(int n) {
        if(n < 0){
            return -1;
        }
        if(n == 1 || n == 0) {
            return n;
        }
        return n + sumSeries(n-1);
    }

    public int sumDigit(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0 ) {
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }

}
