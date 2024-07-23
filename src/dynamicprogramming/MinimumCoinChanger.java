package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoinChanger {
    public int solution(int n, int[] coins, int targetAmount) {
        int minCoins[] = new int[targetAmount+1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0;

        for (int i=0; i<n; i++) {
            for (int j=coins[i]; j<=targetAmount; j++) {
                minCoins[j] = Math.min(minCoins[j], minCoins[j - coins[i]]+1);
            }
        }

        return minCoins[targetAmount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i=0; i<n; i++) {
            coins[i] = scanner.nextInt();
        }
        int targetAmount = scanner.nextInt();
        MinimumCoinChanger minimumCoinChanger = new MinimumCoinChanger();
        System.out.println(minimumCoinChanger.solution(n, coins, targetAmount));
    }
}
