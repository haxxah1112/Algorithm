package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDVDCapacityCalculator {
    public int solution(int dvdCount, int[] arr) {
        int answer = 0;
        int lt= Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (isValid(arr, dvdCount, mid)) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    private boolean isValid(int[] arr, int dvdCount, int capacity) {
        int count = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
                if (count > dvdCount) return false;
            } else {
                sum += x;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dvdCount = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        MinimumDVDCapacityCalculator calculator = new MinimumDVDCapacityCalculator();
        System.out.println(calculator.solution(dvdCount, arr));
    }
}
