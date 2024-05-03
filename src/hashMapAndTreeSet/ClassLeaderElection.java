package hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeaderElection {
    public char solution(int n, String str) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int maxVote =Integer.MIN_VALUE;
        for (Character candidate : map.keySet()) {
            int vote = map.get(candidate);
            if (maxVote < vote) {
                answer = candidate;
                maxVote = vote;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        ClassLeaderElection cl = new ClassLeaderElection();
        System.out.println(cl.solution(n, str));
    }
}
