package graphsearch;

import java.util.Scanner;

public class MaxWeightLoad {
    static int n, capacity, maxWeight = Integer.MIN_VALUE;
    public void dfs(int level, int sum, int[] arr) {
        if (sum > capacity) return;
        if (level == n) {
            maxWeight = Math.max(maxWeight, sum);
        } else {
            dfs(level+1, sum+arr[level], arr);
            dfs(level+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        capacity = scanner.nextInt();
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        MaxWeightLoad maxWeightLoad = new MaxWeightLoad();
        maxWeightLoad.dfs(0, 0, arr);
        System.out.println(maxWeight);
    }
}
