import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDupliate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,2,3,3,4,5})));
    }
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        for(int i : arr) {
            if(prev != i) {
                prev = i;
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
