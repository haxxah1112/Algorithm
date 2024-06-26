package graphsearch;

import java.util.Scanner;

public class BallCombinationCalculator {
    static int totalBall, choice;
    static int[] combination;
    public void dfs(int level, int start) {
        if (level == choice) {
            for (int ball: combination) System.out.print(ball + " ");
            System.out.println();
        }
        else {
            for (int i = start; i<= totalBall; i++){
                combination[level] = i;
                dfs(level+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        totalBall = scanner.nextInt();
        choice = scanner.nextInt();
        combination = new int[choice];
        BallCombinationCalculator calculator = new BallCombinationCalculator();
        calculator.dfs(0, 1);
    }
}
