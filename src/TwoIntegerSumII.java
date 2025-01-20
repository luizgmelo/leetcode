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
        int[] output = new int[2];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (i == j) {
                    continue;
                }


                if (numbers[i] + numbers[j] == target) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                    return output;
                }
            }
        }


        return output;
    }

}
