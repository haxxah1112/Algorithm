package array;

import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i=2; i<n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        FibonacciSequenceGenerator fs = new FibonacciSequenceGenerator();
        for (int x: fs.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
