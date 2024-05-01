package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class ConsecutiveSumCounter {
    public int solution(int n) {
        int answer = 0, lt=0, sum=0;
        int maxLength = n/2 + 1;
        int[] arr = new int[maxLength];
        for (int i=0; i<maxLength; i++) {
            arr[i] = i+1;
        }

        for (int rt=0; rt<maxLength; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum > n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ConsecutiveSumCounter finder = new ConsecutiveSumCounter();
        System.out.println(finder.solution(n));
    }
}
