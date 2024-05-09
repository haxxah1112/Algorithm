package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisRemover {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else stack.push(c);
        }
        for (Character c : stack) {
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ParenthesisRemover pr = new ParenthesisRemover();
        System.out.println(pr.solution(str));
    }
}
