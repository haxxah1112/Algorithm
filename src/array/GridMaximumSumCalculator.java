package array;

import java.util.Scanner;

public class GridMaximumSumCalculator {
    public int solution(int n, int[][] grid) {
        int answer = Integer.MIN_VALUE;
        int rowSum, colSum;
        for (int i=0; i<n; i++) {
            rowSum = 0;
            colSum = 0;
            for (int j=0; j<n; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }
            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, colSum);
        }

        int diagonalSum1 =0, diagonalSum2 = 0;
        for (int i=0; i<n; i++) {
            diagonalSum1 += grid[i][i];
            diagonalSum2 += grid[i][n-i-1];
        }
        answer = Math.max(answer, diagonalSum1);
        answer = Math.max(answer, diagonalSum2);

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        GridMaximumSumCalculator calculator = new GridMaximumSumCalculator();
        System.out.println(calculator.solution(n, grid));
    }
}
