package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MultitabScheduling {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> multitap = new HashSet<>();

        int answer = 0;
        for (int i=0; i<k; i++) {
            int current  = arr[i];
            if (multitap.contains(current)) continue;

            if (multitap.size() < n) multitap.add(current);
            else {
                int idx = 0;
                int latestUse = 0;

                for (int plug : multitap) {
                    int nextUse = Integer.MAX_VALUE;

                    for (int j=i+1; j<k; j++) {
                        if (arr[j] == plug) {
                            nextUse = j;
                            break;
                        }
                    }

                    if (nextUse > latestUse) {
                        latestUse = nextUse;
                        idx = plug;
                    }
                }
                multitap.remove(idx);
                answer++;
                multitap.add(current);
            }
        }
        System.out.println(answer);
    }
}
