package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    public String solution(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        DuplicateRemover dr = new DuplicateRemover();
        System.out.println(dr.solution(str));
    }
}
