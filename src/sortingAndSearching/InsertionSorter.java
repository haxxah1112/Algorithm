package sortingAndSearching;

import java.util.Scanner;

public class InsertionSorter {
    public int[] solution(int n, int[] arr) {
        for (int i=1; i<n; i++) {
            int current = arr[i];
            int j;
            for (j=i-1; j>=0; j--) {
                if (arr[j] > current) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = current;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        InsertionSorter sorter = new InsertionSorter();
        for (int x: sorter.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
