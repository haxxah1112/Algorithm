package dynamicprogramming;

import java.util.Scanner;

public class LongestIncreasingSubsequenceFinder {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int[] subsequence = new int[n];
        for (int i=0; i<n; i++) subsequence[i] = 1;

        for (int i=1; i<n; i++) {
            int maxLength = 0;
            for (int j=i-1; j>=0; j--) {
                if (arr[j] < arr[i] && subsequence[j] > maxLength) maxLength = subsequence[j];
            }
            subsequence[i] = maxLength+1;
            answer = Math.max(answer, subsequence[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        LongestIncreasingSubsequenceFinder finder  = new LongestIncreasingSubsequenceFinder();
        System.out.println(finder.solution(n, arr));
    }
}
