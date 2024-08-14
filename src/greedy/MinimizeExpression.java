package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimizeExpression {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.MAX_VALUE;
        String[] str = br.readLine().split("-");
        
        for (int i=0; i<str.length; i++){
            StringTokenizer st = new StringTokenizer(str[i], "+");
            int temp = 0;
            while (st.hasMoreTokens()) {
                temp += Integer.parseInt(st.nextToken());
            }
            if (answer == Integer.MAX_VALUE) answer = temp;
            else answer-= temp;
        }

        System.out.println(answer);
    }
}
