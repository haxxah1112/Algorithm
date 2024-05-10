package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class DollCraneGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move: moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][move-1] != 0) {
                    int doll = board[i][move-1];
                    board[i][move-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(doll);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) moves[i] = scanner.nextInt();

        DollCraneGame game = new DollCraneGame();
        System.out.println(game.solution(board, moves));
    }
}
