package array;

import java.util.Scanner;

public class RPSGame {
    public String solution(int n, int[] arrA, int[] arrB) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<n; i++) {
            if (arrA[i] == arrB[i]) answer.append("D");
            else if (arrA[i] == 1 && arrB[i] == 3) answer.append("A");
            else if (arrA[i] == 2 && arrB[i] == 1) answer.append("A");
            else if (arrA[i] == 3 && arrB[i] == 2) answer.append("A");
            else answer.append("B");
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i=0; i<n; i++) {
            arrA[i] = scanner.nextInt();
        }
        for (int i=0; i<n; i++) {
            arrB[i] = scanner.nextInt();
        }
        RPSGame rpsGame = new RPSGame();
        System.out.print(rpsGame.solution(n, arrA, arrB));
    }
}
