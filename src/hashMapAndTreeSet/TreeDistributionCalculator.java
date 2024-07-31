package hashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TreeDistributionCalculator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int total = 0;
        Map<String, Integer> treeMap = new HashMap<>();

        while ((str = br.readLine()) != null && !str.trim().isEmpty()) {
            total++;
            treeMap.put(str, treeMap.getOrDefault(str, 0) + 1);
        }

        Object[] keyArr = treeMap.keySet().toArray();
        Arrays.sort(keyArr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < keyArr.length; i++) {
            int treeCount = treeMap.get(keyArr[i]);
            double percent = ((double)treeCount /(double) total) * 100;
            sb.append(keyArr[i])
                    .append(" ")
                    .append(String.format("%.4f", percent))
                    .append("\n");
        }
        System.out.println(sb);

    }
}
