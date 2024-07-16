package dynamicprogramming;

import java.util.Scanner;

public class StoneBridgeWays {

    public int solution(int n, int[] ways) {
        ways[1] = 1;
        ways[2] = 2;
        for (int i=3; i<=n+1; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n+1];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ways = new int[n+2];
        StoneBridgeWays stoneBridgeWays = new StoneBridgeWays();
        System.out.println(stoneBridgeWays.solution(n, ways));
    }
}
