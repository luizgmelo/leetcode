import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        var solution = new SolutionValidAnagram();
        String s = "racecar", t = "carrace";
        System.out.println(solution.isAnagram(s, t));
    }
}

class SolutionValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}

