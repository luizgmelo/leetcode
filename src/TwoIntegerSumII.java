import java.util.Arrays;

public class TwoIntegerSumII {
    public static void main(String[] args) {
        var solution = new TwoIntegerSumII();
        int[] numbers = new int[]{1,2,3,4};
        int target = 3;
        int[] output = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(output));
    }

    public int[] twoSum(int[] numbers, int target) {
       int left = 0;
       int right = numbers.length - 1;

       while (left < right) {
           int sum = numbers[left] + numbers[right];
           if (sum > target) {
                right -= 1;
           } else if (sum < target) {
                left += 1;
           } else {
                return new int[] {left+1, right+1};
           }
       }

       return new int[] {left+1, right+1};
    }
}
