package graphsearch;

import java.util.Scanner;

public class CombinationCalculator {
    public int dfs(int n, int r) {
        if (n == r || r == 0) return 1;
        else return dfs(n-1, r-1) + dfs(n-1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        CombinationCalculator calculator = new CombinationCalculator();
        System.out.println(calculator.dfs(n, r));
    }
}
