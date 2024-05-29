package RecursiceAndTreeAndGraph;

import java.util.Scanner;

public class RecursivePrinter {
    public void print(int n) {
        if (n == 0) return;
        else {
            print(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        RecursivePrinter rp = new RecursivePrinter();
        rp.print(n);
    }
}
