package sortingAndSearching;

import java.util.Scanner;

public class BubbleSorter {
    public int[] solution(int n, int[] arr) {
        for (int i=0; i<n-1; i++) {
            for (int j=0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        BubbleSorter sorter = new BubbleSorter();
        for (int x: sorter.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
