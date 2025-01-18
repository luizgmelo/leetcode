import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        var solution = new LongestConsecutiveSequence();
        int[] nums = new int[]{0,3,2,5,4,6,1,1};
        int output = solution.longestConsecutive(nums);
        System.out.println(output);
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int n : nums) {
            uniqueNumbers.add(n);
        }
        int maxLengthOfSequence = 0;
        for (int num : uniqueNumbers) {
            if (!uniqueNumbers.contains(num - 1)) {
               int currentLengthOfSequence = 1;

               while (uniqueNumbers.contains(num + 1)) {
                   num++;
                   currentLengthOfSequence++;
               }
               maxLengthOfSequence = Math.max(maxLengthOfSequence, currentLengthOfSequence);
            }
        }
        return maxLengthOfSequence;
    }
}
