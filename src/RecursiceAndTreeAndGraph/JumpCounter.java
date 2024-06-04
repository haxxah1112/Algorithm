package RecursiceAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JumpCounter {
    private static final int MAX_POSITION = 10000;
    int[] dis = {1, -1, 5};
    Queue<Integer> queue = new LinkedList<>();
    public int bfs(int startPosition, int targetPosition) {
        if (startPosition == targetPosition) return 0;
        boolean[] visited = new boolean[MAX_POSITION + 1];
        visited[startPosition] = true;
        queue.offer(startPosition);
        int level = 0;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            level++;
            for (int i=0; i<queueSize; i++) {
                int currentPosition = queue.poll();
                for (int j=0; j<dis.length; j++) {
                    int nextPosition = currentPosition + dis[j];
                    if (nextPosition == targetPosition) return level;
                    if (nextPosition>=1 && nextPosition<=MAX_POSITION && !visited[nextPosition]) {
                        visited[nextPosition] = true;
                        queue.offer(nextPosition);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPosition = scanner.nextInt();
        int targetPosition = scanner.nextInt();
        JumpCounter counter = new JumpCounter();
        System.out.println(counter.bfs(startPosition, targetPosition));
    }
}
