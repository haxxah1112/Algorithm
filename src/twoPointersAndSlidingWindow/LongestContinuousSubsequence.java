package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class LongestContinuousSubsequence {
    public int solution(int n, int m, int[] arr) {
        int answer=0, zeroCount=0, lt=0;
        for (int rt=0; rt<n; rt++) {
            if (arr[rt] == 0) zeroCount++;
            while (zeroCount > m) {
                if (arr[lt] == 0) zeroCount--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        LongestContinuousSubsequence lcs = new LongestContinuousSubsequence();
        System.out.println(lcs.solution(n, m, arr));
    }
}
