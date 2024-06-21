package graphsearch;

import java.util.Scanner;

public class CoinChange {
    static int n, targetAmount, answer = Integer.MAX_VALUE;
    public void dfs(int coinCount, int currentSum, int[] coins) {
        if (currentSum > targetAmount) return;
        if (coinCount >= answer) return;
        if (currentSum == targetAmount) answer = Math.min(answer, coinCount);
        else {
            for (int i=0; i<n; i++) {
                dfs(coinCount+1, currentSum+coins[i], coins);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i=0; i<n; i++) {
            coins[i] = scanner.nextInt();
        }
        targetAmount = scanner.nextInt();
        CoinChange coinChange = new CoinChange();
        coinChange.dfs(0, 0, coins);
        System.out.println(answer);
    }
}
