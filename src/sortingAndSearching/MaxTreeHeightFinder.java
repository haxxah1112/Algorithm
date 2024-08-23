package sortingAndSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxTreeHeightFinder {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        int min = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        int sum, middle;
        while(min <= max) {
            sum = 0;
            middle = (min + max) / 2;
            for (int tree : trees) {
                if (tree > middle) sum += tree - middle;
            }

            if (sum >= m) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }

        System.out.println(max);
    }
}
