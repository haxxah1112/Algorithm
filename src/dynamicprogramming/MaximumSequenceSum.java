package dynamicprogramming;

import java.util.Scanner;

public class MaximumSequenceSum {
    public int solution(int[] sequence) {
        int maxSum = sequence[0]; // 최대 합 초기화
        int currentSum = sequence[0]; // 현재 부분 수열의 합 초기화

        for (int i = 1; i<sequence.length; i++) {
            currentSum = Math.max(sequence[i], currentSum + sequence[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i=0; i<n; i++) {
            sequence[i] = scanner.nextInt();
        }

        MaximumSequenceSum maximumSequenceSum = new MaximumSequenceSum();
        System.out.println(maximumSequenceSum.solution(sequence));
    }
}
