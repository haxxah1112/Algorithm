package math;

import java.util.Scanner;

public class DiagonalTilesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int gcb = gcb(x, y);

        System.out.println(x + y - gcb);
    }

    private static int gcb(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }


}