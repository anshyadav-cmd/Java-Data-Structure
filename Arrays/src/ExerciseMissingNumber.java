public class ExerciseMissingNumber {
    static int missingNumber(int[] arr, int totalCount) {
        int totalSum = 0;
        int sum = 0;
        totalSum = (totalCount*(totalCount+1))/2;
        for(int i : arr) {
            sum += i;
        }
        return totalSum - sum;
    }
}
