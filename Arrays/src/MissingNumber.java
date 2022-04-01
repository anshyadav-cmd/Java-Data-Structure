public class MissingNumber {
    public static void missingNumber(int[] intArray) {
    // TODO
    // for 1 to 10
        // n(n+1)/2
        int n = 10;
        int accpectedSum = (n*(n+1))/2;
        int sum= 0;
        for(int i : intArray){
            sum += i;
        }
        System.out.println((accpectedSum - sum));
    }

    public static void main(String[] args) {
        missingNumber(new int[] {1,2,3,4,5,7,8,9,10});
    }

}