package RecursiceAndTreeAndGraph;

import java.util.Scanner;

public class BinaryConverter {
    public void convert(int n) {
        StringBuilder answer = new StringBuilder();
        if (n == 0) return;
        else {
            System.out.print(n%2);
            convert(n/2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BinaryConverter converter = new BinaryConverter();
        converter.convert(n);
    }
}
