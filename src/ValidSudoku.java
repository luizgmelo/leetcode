import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        var solution = new ValidSudoku();
        char[][] board = new char[][]
                        {{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                         {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                         {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                         {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                         {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                         {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                         {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                         {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                         {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean output = solution.isValidSudoku(board);
        System.out.println(output);
    }
        
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num != '.') {
                    if (!seen.add(num + " at row " + i) ||
                        !seen.add(num + " at col " + j) ||
                        !seen.add(num + " at box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
