package graphsearch;

import java.util.Scanner;

public class IslandCounter {
    static int n, answer = 0;
    static final int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static final int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void dfs(int x, int y, int[][] map) {
        map[x][y] = 0;
        for (int i=0; i<8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (isValidMove(nextX, nextY, map)) {
                dfs(nextX, nextY, map);
            }
        }
    }

    public void solution(int[][] map) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    dfs(i, j, map);
                }
            }
        }
    }

    private boolean isValidMove(int x, int y, int[][] map) {
        return x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] map = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        IslandCounter counter = new IslandCounter();
        counter.solution(map);
        System.out.println(answer);
    }
}
