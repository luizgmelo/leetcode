import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        var solution = new SolutionTwoSum();
        int[] nums = new int[]{3,4,5,6};
        int target = 7;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                result[0] = prevMap.get(diff);
                result[1] = i;
                return result;
            } else {
                prevMap.put(nums[i], i);
            }
        }

        return result;
    }
}

