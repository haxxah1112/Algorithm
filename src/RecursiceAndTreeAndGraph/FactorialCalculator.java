package RecursiceAndTreeAndGraph;

import java.util.Scanner;

public class FactorialCalculator {
    public int calculate(int n) {
        if (n == 1) return 1;
        else {
            return n * calculate(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        FactorialCalculator factorial = new FactorialCalculator();
        System.out.println(factorial.calculate(n));
    }
}
