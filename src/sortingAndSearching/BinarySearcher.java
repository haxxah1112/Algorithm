package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearcher {
    public int solution(int n, int findNumber, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (arr[mid] == findNumber) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > findNumber) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int findNumber = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        BinarySearcher searcher = new BinarySearcher();
        System.out.println(searcher.solution(n, findNumber, arr));
    }
}
