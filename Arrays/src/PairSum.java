import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        System.out.println(pairSum(new int[] {2,4,3,5,6,-2,4,7,8,9},7));
    }
    public static String pairSum(int[] myArray, int sum) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < myArray.length; i++) {
            for(int j = i ; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == sum) {
                    stringBuilder.append(myArray[i] + ":" + myArray[j] + " ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
