public class SumProductArray {
    public static void main(String[] args) {
        spofArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
    private static void spofArray(int[] arr) {
        int sum = 0 , pro = 1; // O(1) + O(1)
        for(int value : arr) {  // O(N)
            sum += value ; //  O(1)
            pro *= value; // O(1)
        }
        System.out.println("Sum is: " + sum); // O(1)
        System.out.println("Product is: " + pro); // O(1)
    }

    /**
     *  O(N)  IS THE TIME COMPLEXITY OF THE GIVEN PROGRAM
     */
}
