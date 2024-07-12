package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxRevenueCalculator {
    static int n, max = Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> lectures) {
        int totalRevenue = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(lectures);
        int j=0;
        for (int i=max; i>=1; i--) {
            for (; j<n; j++) {
                if (lectures.get(j).date < i) break;
                queue.offer(lectures.get(j).revenue);
            }
            if (!queue.isEmpty()) {
                totalRevenue += queue.poll();
            }
        }

        return totalRevenue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Lecture> lectures = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int revenue = scanner.nextInt();
            int date = scanner.nextInt();
            lectures.add(new Lecture(revenue, date));
            if (date > max) max = date;
        }
        MaxRevenueCalculator calculator = new MaxRevenueCalculator();
        System.out.println(calculator.solution(lectures));
    }
}

class Lecture implements Comparable<Lecture> {
    int revenue;
    int date;

    Lecture(int revenue, int time) {
        this.revenue = revenue;
        this.date = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}