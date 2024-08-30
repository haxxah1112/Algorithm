package RecursiceAndTreeAndGraph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PathExistenceChecker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        StringTokenizer st;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][k] == 1 && arr[k][j] == 1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
