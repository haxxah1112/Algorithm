package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramFinder {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char x: b.toCharArray()) bMap.put(x, bMap.getOrDefault(x, 0)+1);

        HashMap<Character, Integer> aMap = new HashMap<>();
        int windowSize = b.length();
        for (int i=0; i<windowSize-1; i++) aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0)+1);

        int lt=0;
        for (int rt=windowSize-1; rt<a.length(); rt++) {
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0)+1);
            if (aMap.equals(bMap)) answer++;

            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt))-1);
            if (aMap.get(a.charAt(lt)) == 0) aMap.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        AnagramFinder finder = new AnagramFinder();
        System.out.println(finder.solution(a, b));
    }
}
