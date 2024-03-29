package string;

import java.util.Scanner;

public class LongWordIdentifier {
    public String solution(String str){
        String[] words = str.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LongWordIdentifier identifier = new LongWordIdentifier();
        System.out.println(identifier.solution(str));
    }
}
