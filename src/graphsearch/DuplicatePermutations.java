package graphsearch;

import java.util.Scanner;

public class DuplicatePermutations {
    static int[] permutation;
    static int n, permutationLength;
    public void dfs(int level) {
        if (level == permutationLength) {
            for (int x: permutation) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                permutation[level] = i;
                dfs(level+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        permutationLength = scanner.nextInt();
        permutation = new int[permutationLength];
        DuplicatePermutations duplicatePermutations = new DuplicatePermutations();
        duplicatePermutations.dfs(0);
    }
}
