package graphsearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ApartmentComplexFinder {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] isVisited;
    static int[][] arr;
    static int count, n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        isVisited = new boolean[n][n];

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<n; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        ApartmentComplexFinder finder = new ApartmentComplexFinder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                count=0;
                if (!isVisited[i][j] && arr[i][j] == 1) {
                    finder.dfs(i, j);
                    list.add(count);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for (Integer x : list) System.out.println(x);
    }

    public void dfs(int x, int y) {
        isVisited[x][y] = true;
        count++;

        for (int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && !isVisited[nextX][nextY] && arr[nextX][nextY] == 1) {
                dfs(nextX, nextY);
            }
        }
    }
}
