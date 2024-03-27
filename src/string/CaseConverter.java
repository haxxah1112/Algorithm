package string;

import java.util.Scanner;

public class CaseConverter {
    public String solution(String str) {
        String answer = "";
        for (char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        CaseConverter cc = new CaseConverter();
        System.out.println(cc.solution(str));
    }
}
