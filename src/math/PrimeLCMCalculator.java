package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();
        int answer = 1;

        for (int i=0; i<n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) primes.add(num);
        }

        if (primes.isEmpty()) System.out.println(-1);
        else {
            for (int i=0; i< primes.size(); i++) {
                answer *= primes.get(i);
            }
            System.out.println(answer);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
