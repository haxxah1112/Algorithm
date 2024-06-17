package graphsearch;

import java.util.Scanner;

public class MaxScoreCalculator {
    static int answer = Integer.MIN_VALUE, n, maxTime;
    public void dfs(int level, int currentScore, int currentTime, int[] scores, int[] times) {
        if (currentTime > maxTime) return;
        if (level == n) {
            answer = Math.max(answer, currentScore);
        } else {
            dfs(level+1, currentScore+scores[level], currentTime+times[level], scores, times);
            dfs(level+1, currentScore, currentTime, scores, times);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        maxTime = scanner.nextInt();
        int[] scores = new int[n];
        int[] times = new int[n];
        for (int i=0; i<n; i++) {
            scores[i] = scanner.nextInt();
            times[i] = scanner.nextInt();
        }
        MaxScoreCalculator calculator = new MaxScoreCalculator();
        calculator.dfs(0, 0, 0, scores, times);
        System.out.println(answer);
    }
}
