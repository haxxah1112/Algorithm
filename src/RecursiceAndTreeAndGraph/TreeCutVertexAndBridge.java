package RecursiceAndTreeAndGraph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TreeCutVertexAndBridge {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer>[] list = new ArrayList[n+1];
        for(int i=1; i<n+1; i++) {
            list[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i=0; i<n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        StringBuilder sb = new StringBuilder();
        int q = Integer.parseInt(br.readLine());
        for(int i=0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            if(t==2) {
                sb.append("yes\n");
            } else {
                int k = Integer.parseInt(st.nextToken());
                if(list[k].size() >= 2) sb.append("yes\n");
                else sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}
