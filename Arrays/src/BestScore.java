import java.util.Arrays;
import java.util.Collections;

public class BestScore {
    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0] + " " + arr[1];
    }
}
