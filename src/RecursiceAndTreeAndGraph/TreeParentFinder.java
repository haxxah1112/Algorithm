package RecursiceAndTreeAndGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeParentFinder {
    static int n;
    static int[] parents;
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] isVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        parents = new int[n+1];
        isVisited = new boolean[n+1];
        
        for (int i=0; i<n+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i=0; i<n-1; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();

            adjList.get(node1).add(node2);
            adjList.get(node2).add(node1);
        }

        dfs(1);

        for (int i=2; i<n+1; i++) {
            System.out.println(parents[i]);
        }
    }

    static void dfs(int node) {
        isVisited[node] = true;
        for (int nextNode : adjList.get(node)) {
            if (!isVisited[nextNode]) {
                dfs(nextNode);
                parents[nextNode] = node;
            }
        }
    }
}
