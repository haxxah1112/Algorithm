package array;

import java.util.Scanner;

public class RankingCalculator {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int rank = 1;
            for (int j=0; j<n; j++) {
                if (i != j && arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        RankingCalculator rc = new RankingCalculator();
        for (int x: rc.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
