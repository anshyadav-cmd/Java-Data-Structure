import java.util.Arrays;

public class MaxProduct {
    public String maxProduct(int[] intArray) {
        // TODO
        Arrays.sort(intArray);
        return intArray[intArray.length-1]+"" + "," + intArray[intArray.length-2] + "";
    }
}
