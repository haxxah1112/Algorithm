package string;

import java.util.Scanner;

public class CharacterReverser {
    public String solution(String str) {
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while(lt < rt){
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if(!Character.isAlphabetic(charArray[rt])) rt--;
            else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        CharacterReverser cr = new CharacterReverser();
        System.out.println(cr.solution(str));
    }
}
