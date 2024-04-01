package string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverser {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String word : str) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            answer.add(reversedWord);
        }
        return answer;
    }

    public static void main(String[] args) {
        WordReverser wordReverser = new WordReverser();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i=0; i<n; i++) {
            words[i] = scanner.next();
        }
        for (String x: wordReverser.solution(n, words)) {
            System.out.println(x);
        }
    }
}
