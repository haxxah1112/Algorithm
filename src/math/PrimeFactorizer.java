package math;

import java.util.Scanner;

public class PrimeFactorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i=2; i<=Math.sqrt(n); i++) {
            while (n%i == 0) {
                n = n/i;
                sb.append(i).append("\n");
            }
        }

        if (n > 1) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }
}
