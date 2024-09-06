package graphsearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MaxHackingComputerFinder {
    public static List<ArrayList<Integer>> arr;
    public static boolean[] isVisited;
    public static int[] answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        answer = new int[n+1];

        arr = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
        }

        for(int i=1; i<=n;i++) {
            isVisited = new boolean[n+1];
            BFS(i);
        }

        for (int value : answer) {
            max = Math.max(max, value);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            if (answer[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }

    private static void BFS(int i) {
        Queue<Integer> queue = new LinkedList<Integer>();
        isVisited[i] = true;
        queue.add(i);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int x : arr.get(current)) {
                if(!isVisited[x]) {
                    isVisited[x] = true;
                    answer[x]++;
                    queue.add(x);
                }
            }
        }
    }
}
