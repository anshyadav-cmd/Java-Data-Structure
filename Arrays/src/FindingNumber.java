public class FindingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5};
        int value = 4;
        System.out.println(searchInArray(arr, value));
    }
    public static int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

}
