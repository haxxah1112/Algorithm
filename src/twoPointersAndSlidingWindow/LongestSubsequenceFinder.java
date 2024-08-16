package twoPointersAndSlidingWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LongestSubsequenceFinder {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left=0, right=0, answer=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        while (left < n && right < n) {
            if (map.getOrDefault(arr[right], 0)+1 > k) {
                map.put(arr[left], map.get(arr[left])-1);
                left++;
            } else {
                map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
                right++;
                answer = Math.max(answer, right-left);
            }
        }
        System.out.println(answer);
    }
}
