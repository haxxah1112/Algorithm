package RecursiceAndTreeAndGraph;

import java.util.Scanner;

public class FibonacciCalculator {
    private static int[] fibo;
    public int calculate(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        }
        else return fibo[n] = calculate(n-2) + calculate(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo = new int[n+1];
        FibonacciCalculator fibonacci = new FibonacciCalculator();
        for (int i=1; i<=n; i++) System.out.println(fibonacci.calculate(i));
    }
}
