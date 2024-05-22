package sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChangedPositionFinder {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for (int i=0; i<n; i++) {
            if (arr[i] != sortedArr[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        ChangedPositionFinder finder = new ChangedPositionFinder();
        for (int x: finder.solution(n, arr)) System.out.print(x + " ");
    }
}
