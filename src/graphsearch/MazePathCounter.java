package graphsearch;

import java.util.Scanner;

public class MazePathCounter {
    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};
    static int[][] maze;
    static int answer = 0;
    public void dfs(int x, int y) {
        if (x==7 && y==7) answer++;
        else {
            for (int i=0; i<4; i++) {
                int nextX = x+dx[i];
                int nextY = y+dy[i];
                if (isValidMove(nextX, nextY)) {
                    maze[nextX][nextY] = 1;
                    dfs(nextX, nextY);
                    maze[nextX][nextY] = 0;
                }
            }
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 1 && x <= 7 && y >= 1 && y <= 7 && maze[x][y] == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        maze = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        maze[1][1] = 1;
        MazePathCounter counter = new MazePathCounter();
        counter.dfs(1, 1);
        System.out.println(answer);
    }
}
