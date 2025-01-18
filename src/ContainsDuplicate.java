import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        var solution = new ContainsDuplicate();
        System.out.println(solution.hasDuplicate(new int[]{1, 2, 3, 3}));
    }

    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}


