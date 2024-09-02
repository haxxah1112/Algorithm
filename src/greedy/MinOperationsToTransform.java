package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MinOperationsToTransform {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(a*2);
        queue.add(a*10+1);

        int answer = 1;
        while(!queue.isEmpty()) {
            answer++;
            int size = queue.size();

            for (int i=0; i<size; i++) {
                int now = queue.poll();
                if(now < b) {
                    queue.add(now*2);
                    queue.add(now*10+1);
                }
                if(now == b) {
                    System.out.println(answer);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
