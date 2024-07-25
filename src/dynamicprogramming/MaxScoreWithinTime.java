package dynamicprogramming;

import java.util.Scanner;

public class MaxScoreWithinTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxTime = scanner.nextInt();
        int[] arr = new int[maxTime+1];

        for (int i=0; i<n; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            for (int j=maxTime; j>=time; j--) {
                arr[j] = Math.max(arr[j], arr[j-time] + score);
            }
        }
        
        System.out.println(arr[maxTime]);
    }
}