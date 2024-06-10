package RecursiceAndTreeAndGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathFinder {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] distance;

    public void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        distance[startNode] = 0;
        queue.offer(startNode);
        while (!queue.isEmpty()) {
            for (int i=0; i<n; i++) {
                int currentNode = queue.poll();
                for (int nextNode : graph.get(currentNode)) {
                    if (!visited[nextNode]) {
                        visited[nextNode] = true;
                        queue.offer(nextNode);
                        distance[nextNode] = distance[currentNode] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        visited = new boolean[n+1];
        distance = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }
        ShortestPathFinder finder = new ShortestPathFinder();
        finder.bfs(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i+" : " + distance[i]);
        }
    }
}
