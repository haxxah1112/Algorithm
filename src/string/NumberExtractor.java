package string;

import java.util.Scanner;

public class NumberExtractor {
    public int solution(String str) {
        int answer = 0;
        char[] array = str.toCharArray();
        for (char c : array) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                answer = answer * 10 + digit;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        NumberExtractor ne = new NumberExtractor();
        System.out.println(ne.solution(str));
    }
}
