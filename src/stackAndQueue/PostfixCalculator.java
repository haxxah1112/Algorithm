package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {
    public int solution(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char c: postfix.toCharArray()) {
            if (Character.isDigit(c)) stack.push(c - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(lt + rt);
                        break;
                    case '-':
                        stack.push(lt - rt);
                        break;
                    case '*':
                        stack.push(lt * rt);
                        break;
                    case '/':
                        stack.push(lt / rt);
                        break;
                }
            }
        }
        return stack.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String postfix = scanner.next();
        PostfixCalculator calculator = new PostfixCalculator();
        System.out.println(calculator.solution(postfix));
    }
}
