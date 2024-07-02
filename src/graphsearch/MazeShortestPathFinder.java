package graphsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortestPathFinder {
    static int[][] maze, distance;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        maze[x][y] = 1;
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            for (int i=0; i<4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];
                if (isValidMove(nextX, nextY)) {
                    maze[nextX][nextY] = 1;
                    queue.offer(new Point(nextX, nextY));
                    distance[nextX][nextY] = distance[current.x][current.y] + 1;
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
        distance = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        MazeShortestPathFinder mazeShortestPathFinder = new MazeShortestPathFinder();
        mazeShortestPathFinder.bfs(1,1);
        if (distance[7][7] == 0) System.out.println(-1);
        else System.out.println(distance[7][7]);
    }
}

class Point{
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}