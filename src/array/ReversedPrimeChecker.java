package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedPrimeChecker {
    private boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i=2; i<n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int num = arr[i];
            int reversedNum  = 0;
            while (num > 0) {
                int digit = num % 10;
                reversedNum  = reversedNum * 10 + digit;
                num = num / 10;
            }
            if (isPrime(reversedNum )) answer.add(reversedNum );
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
        ReversedPrimeChecker rp = new ReversedPrimeChecker();
        for (int x: rp.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
