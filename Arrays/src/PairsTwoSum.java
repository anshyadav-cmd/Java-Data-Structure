import java.util.Arrays;

public class PairsTwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,5,1};
        int targetValue = 7;
        System.out.println(Arrays.toString(twoSum(arr, targetValue)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] + nums[i+1] == target) {
                return new int[] {i, i+1};
            }
            else if(nums[i] + nums[i+1] > target){
                break;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
