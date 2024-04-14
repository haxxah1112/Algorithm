package array;

import java.util.Scanner;

public class VisibleNumberCounter {
    public int solution(int n, int[] arr) {
        int max = arr[0];
        int count = 1;
        for (int i=1; i<n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        VisibleNumberCounter vn = new VisibleNumberCounter();
        System.out.print(vn.solution(n, arr));
    }
}
