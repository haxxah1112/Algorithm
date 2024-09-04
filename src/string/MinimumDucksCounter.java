package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumDucksCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.length() % 5 != 0) {
            System.out.println(-1);
            return;
        }

        char[] arr = str.toCharArray();
        boolean[] used = new boolean[str.length()];
        char[] sound = {'q', 'u', 'a', 'c', 'k'};

        int idx = 0, answer = 0, count = arr.length;
        while (true) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] == sound[idx] && !used[i]) {
                    idx = (idx + 1) % 5;
                    used[i] = true;
                    count--;
                }
            }

            if(idx == 0) answer++;
            else {
                System.out.println(-1);
                return;
            }

            if(count == 0) break;
        }

        System.out.println(answer);
    }
}
