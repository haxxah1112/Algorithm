package String;

import java.util.Scanner;

public class findString {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t= Character.toUpperCase(t);

        for (char x: str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        findString t = new findString();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c= scanner.next().charAt(0);
        System.out.println(t.solution(str, c));
    }
}
