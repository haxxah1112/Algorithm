package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumChecker {
    public String solution(String mandatoryCourses, String plannedCourses) {
        Queue<Character> queue = new LinkedList<>();
        for (Character c : mandatoryCourses.toCharArray()) {
            queue.offer(c);
        }

        for (Character c : plannedCourses.toCharArray()) {
            if (!queue.isEmpty() && c.equals(queue.peek())) queue.poll();
        }
        return queue.isEmpty() ? "YES" : "NO";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mandatoryCourses = scanner.next();
        String plannedCourses = scanner.next();
        CurriculumChecker checker = new CurriculumChecker();
        System.out.println(checker.solution(mandatoryCourses, plannedCourses));
    }
}
