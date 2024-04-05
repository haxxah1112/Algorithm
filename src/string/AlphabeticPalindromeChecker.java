package string;

import java.util.Scanner;

public class AlphabeticPalindromeChecker {
    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversedWord = new StringBuilder(str).reverse().toString();
        return str.equals(reversedWord) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        AlphabeticPalindromeChecker checker = new AlphabeticPalindromeChecker();
        System.out.println(checker.solution(str));
    }
}
