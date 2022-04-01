public class PairsOfArray {
    public static void main(String[] args) {
        pair(new int [] {1,2,3,4});
    }
    private static void pair(int[] arr) {
        for(int i : arr) {      //  O(N)
            for(int j : arr) {  //  O(N)
                System.out.print(i +"" + j + " "); // O(1)
            }
            System.out.println();  // O(1)
        }
    }
}

/**
 * O(N^2) IS THE TIME COMPLEXITY OF THE GIVEN PROGRAM
 */
