package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CycleLengthCalculator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int start = n;
        int count = 0, next = n;

        while (true) {
            int ten = next/10;
            int one = next%10;
            next = ((one)*10) + (ten + one)%10;
            count++;

            if (next == start) break;
        }

        System.out.println(count);
    }
}
