package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisValidator {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ParenthesisValidator validator = new ParenthesisValidator();
        System.out.println(validator.solution(str));
    }
}
