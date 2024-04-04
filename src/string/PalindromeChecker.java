package string;

import java.util.Scanner;

public class PalindromeChecker {
    public String solution(String str) {
        String reversedWord = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedWord) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.solution(str));
    }
}
