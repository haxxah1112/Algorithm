package string;

import java.util.Scanner;

public class MinimumDistanceCalculator {
    public int[] solution(String s, char c) {
        int[] answer = new int[s.length()];
        int distance = Integer.MAX_VALUE / 2;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) distance = 0;
            else distance++;
            answer[i] = distance;
        }
        distance = Integer.MAX_VALUE / 2;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) == c) distance = 0;
            else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char character = scanner.next().charAt(0);
        MinimumDistanceCalculator calculator = new MinimumDistanceCalculator();
        for (int i:calculator.solution(str, character)) {
            System.out.print(i+ " ");
        }
    }
}
