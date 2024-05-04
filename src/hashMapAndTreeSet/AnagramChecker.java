package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public String solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) return "NO";

            if (map.get(c) == 1) map.remove(c);
            else map.put(c, map.get(c)-1);
        }

        return map.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        AnagramChecker checker = new AnagramChecker();
        System.out.println(checker.solution(str1, str2));
    }
}
