import java.util.Arrays;

public class Unique {
    public boolean isUnique(int[] intArray) {
        Arrays.sort(intArray);
        for(int i = 0 ; i < intArray.length-1; i++) {
            if(intArray[i] == intArray[i+1]) {
                return false;
            }
        }
        return true;
    }
}
