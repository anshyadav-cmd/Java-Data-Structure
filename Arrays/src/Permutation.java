import java.util.Arrays;

public class Permutation {
//    public boolean permutation(int[] array1, int[] array2){
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//        return Arrays.equals(array1, array2);
//    }
    public boolean permutation(int[] arr2, int[] arr1) {
        int sum1 = 0 , sum2 = 0, multi1 = 1, multi2 = 1;
        for(int i = 0 ; i < arr1.length; i++) {
            sum1 += arr1[i];
            multi1 *= arr1[i];
        }
        for(int i = 0 ; i < arr2.length; i++) {
            sum2 += arr2[i];
            multi2 *= arr2[i];
        }
        return (sum1 == sum2 ) && (multi1 == multi2);
    }
}
