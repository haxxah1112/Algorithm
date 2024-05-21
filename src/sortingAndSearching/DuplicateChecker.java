package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateChecker {
    public String solution(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) return "duplication";
        }
        return "no duplication";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        DuplicateChecker checker = new DuplicateChecker();
        System.out.println(checker.solution(n, arr));
    }
}
