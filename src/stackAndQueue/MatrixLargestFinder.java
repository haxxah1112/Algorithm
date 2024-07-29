package stackAndQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MatrixLargestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(n);
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int num = scanner.nextInt();
                if (queue.size() < n) queue.add(num);
                else if (queue.peek() < num) {
                    queue.poll();
                    queue.add(num);
                }
            }
        }
        System.out.println(queue.peek());
    }
}
