package RecursiceAndTreeAndGraph;

import java.util.Scanner;

public class PathCounter {
    static int nodeCount, edgeCount, answer = 0;
    static int[] visited;
    static int[][] graph;

    public void dfs(int currentNode) {
        if (currentNode == nodeCount) answer++;
        else {
            for (int nextNode = 1; nextNode<= nodeCount; nextNode++) {
                if (graph[currentNode][nextNode] == 1 && visited[nextNode] == 0){
                    visited[nextNode] = 1;
                    dfs(nextNode);
                    visited[nextNode] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nodeCount = scanner.nextInt();
        edgeCount = scanner.nextInt();
        graph = new int[nodeCount+1][nodeCount+1];
        visited = new int[nodeCount+1];
        for (int i = 0; i < edgeCount; i++) {
            int fromNode = scanner.nextInt();
            int toNode = scanner.nextInt();
            graph[fromNode][toNode] = 1;
        }

        visited[1] = 1;
        PathCounter pathCounter = new PathCounter();
        pathCounter.dfs(1);
        
        System.out.println(answer);
    }
}
