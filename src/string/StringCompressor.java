package string;

import java.util.Scanner;

public class StringCompressor {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char prevChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == prevChar) count++;
            else {
                answer.append(prevChar);
                if (count > 1) answer.append(count);
                prevChar = currentChar;
                count = 1;
            }
        }
        answer.append(prevChar);
        if (count > 1) answer.append(count);

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringCompressor sc = new StringCompressor();
        System.out.println(sc.solution(str));
    }
}
