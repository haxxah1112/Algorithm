package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int order;
    int priority;

    public Person(int order, int priority) {
        this.order = order;
        this.priority = priority;
    }
}

public class EmergencyRoomQueue {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i=0; i<n; i++) queue.add(new Person(i, arr[i]));

        while (!queue.isEmpty()) {
            Person current = queue.poll();
            boolean isHigherPriority = false;
            for (Person x: queue) {
                if (x.priority > current.priority) {
                    queue.add(current);
                    isHigherPriority = true;
                    break;
                }
            }
            if (!isHigherPriority) {
                answer++;
                if (current.order == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        EmergencyRoomQueue er = new EmergencyRoomQueue();
        System.out.println(er.solution(n, m, arr));
    }
}
