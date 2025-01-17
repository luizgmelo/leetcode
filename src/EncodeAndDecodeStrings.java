import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        var solution = new EncodeAndDecodeStrings();
        List<String> strs = List.of("neet","code","love","you");
        String encode = solution.encode(strs);
        System.out.println(encode);
        List<String> decoded = solution.decode(encode);
        System.out.println(decoded.toString());

    }

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();

        for (String str : strs) {
            encode.append(str.length()).append('#').append(str);
        }

        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded= new ArrayList<>();
        int i = 0;
        int j;
        int length;

        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j += 1;
            }
            length = Integer.parseInt(str.substring(i, j));
            decoded.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }

        return decoded;
    }
}
