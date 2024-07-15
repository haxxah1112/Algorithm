package dynamicprogramming;

import java.util.Scanner;

public class StaircaseClimber {
    static int[] ways;
    public int solution(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;

        ways[1] = 1;
        ways[2] = 2;
        for (int i=3; i<=n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ways = new int[n+1];
        StaircaseClimber staircaseClimber = new StaircaseClimber();
        System.out.println(staircaseClimber.solution(n));
    }
}
