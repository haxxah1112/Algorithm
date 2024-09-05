package hashMapAndTreeSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PartsRentalPenaltyCalculator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        String L = st.nextToken();
        int DDD = Integer.parseInt(L.substring(0, 3));
        int hh = Integer.parseInt(L.substring(4, 6));
        int mm = Integer.parseInt(L.substring(7, 9));
        int limit = DDD * 24 * 60 + hh * 60 + mm;

        int F = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Long> result = new HashMap<>();
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String time = st.nextToken();
            String item = st.nextToken();
            String user = st.nextToken();
            String id = user + ":" + item;

            if (map.containsKey(id)) {
                LocalDateTime start = LocalDateTime.parse(map.get(id), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                LocalDateTime end = LocalDateTime.parse(date + " " + time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

                Duration duration = Duration.between(start, end);
                long diff = duration.toMinutes();

                if (diff > limit) {
                    result.put(user, result.getOrDefault(user, 0L) + (diff - limit) * F);
                }
                map.remove(id);
            } else map.put(id, date + " " + time);
        }

        if (result.isEmpty()) System.out.println(-1);
        else {
            List<String> users = new ArrayList<>(result.keySet());
            Collections.sort(users);
            for (int i=0; i<result.size(); i++) {
                String key = users.get(i);
                System.out.println(key + " " + result.get(key));
            }
        }
    }
}
