package string;

import java.util.Scanner;

public class AsciiDecoder {
    public String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String binary = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int decimal  = Integer.parseInt(binary, 2);
            answer.append((char) decimal);
            str = str.substring(7);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        AsciiDecoder ad = new AsciiDecoder();
        System.out.println(ad.solution(n, str));
    }
}
