package graphsearch;

import java.util.Scanner;

public class PartitionEqualSubsetSum {
    static int n, total=0;
    static String answer="NO";
    static boolean flag=false;
    public void dfs(int level, int sum, int[] arr) {
        if (flag) return;
        if (sum > total/2) return;
        if (level == n) {
            if (sum == total - sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            dfs(level+1, sum+arr[level], arr);
            dfs(level+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        PartitionEqualSubsetSum partitionEqualSubsetSum = new PartitionEqualSubsetSum();
        partitionEqualSubsetSum.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
