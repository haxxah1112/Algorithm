package greedy;

import java.util.Scanner;

public class NewNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        NewNumberConverter converter = new NewNumberConverter();
        System.out.println(converter.findMax(number));
        System.out.println(converter.findMin(number));
    }

    public StringBuilder findMax(String num) {
        StringBuilder sb = new StringBuilder();
        int MCount = 0;

        for (int i=0; i<num.length(); i++) {
            if (num.charAt(i) == 'M') MCount++;
            else if (num.charAt(i) == 'K') {
                sb.append('5');
                if (MCount > 0) {
                    for (int j=0; j<MCount; j++) {
                        sb.append('0');
                    }
                }
                MCount = 0;
            }
        }

        if (MCount > 0) {
           sb.append('1');
        }

        return sb;
    }

    public StringBuilder findMin(String num) {
        StringBuilder sb = new StringBuilder();
        int MCount = 0;

        for (int i=0; i<num.length(); i++) {
           if (num.charAt(i) == 'M') MCount++;
           else if (num.charAt(i) == 'K') {
               if (MCount > 0) {
                   sb.append('1');
                   for (int j=1; j<MCount; j++) {
                       sb.append('0');
                   }
                   sb.append('5');
               } else sb.append('5');
               MCount = 0;
           }
        }

        if (MCount > 0) {
            sb.append('1');
        }

        return sb;
    }
}
