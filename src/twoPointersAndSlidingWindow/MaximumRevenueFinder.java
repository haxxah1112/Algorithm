package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaximumRevenueFinder {
    public int solution(int n, int k, int[] arr) {
        int answer=0, sum=0;
        for (int i=0; i<k; i++) sum += arr[i];
        answer = sum;
        for (int i=k; i<n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        MaximumRevenueFinder mr = new MaximumRevenueFinder();
        System.out.println(mr.solution(n, k, arr));
    }
}
