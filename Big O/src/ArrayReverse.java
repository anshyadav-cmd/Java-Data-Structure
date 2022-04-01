import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        reverse(new int[] {1,2,3,4,5,6,7});
    }
    private static void reverse (int[] arr) {
        for(int i = 0 ; i < arr.length/2; i++) {
            int index = arr.length-1-i;
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
//        int a = 0;
//        int b= 0;
//        System.out.println(++a);
//        System.out.println(b++);
    }
}
