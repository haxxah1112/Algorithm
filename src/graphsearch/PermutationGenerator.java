package graphsearch;

import java.util.Scanner;

public class PermutationGenerator {
    static int n, permLength;
    static boolean[] visited;
    static int[] arr, currentPermutation;
    public void dfs(int level) {
        if (level == permLength) {
            for (int x: currentPermutation) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i=0; i<n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    currentPermutation[level] = arr[i];
                    dfs(level+1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        permLength = scanner.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        visited = new boolean[n];
        currentPermutation = new int[permLength];
        PermutationGenerator generator =  new PermutationGenerator();
        generator.dfs(0);
    }
}
