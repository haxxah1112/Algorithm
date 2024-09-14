package dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WineTasting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] wines = new int[n+1];

        for (int i=1; i<=n; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wines[1];
        dp[2] = wines[1] + wines[2];
        for (int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wines[i], dp[i-3] + wines[i] + wines[i-1]));
        }

        System.out.println(dp[n-1]);
    }
}
