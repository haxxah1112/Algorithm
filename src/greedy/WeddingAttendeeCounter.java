package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WeddingAttendeeCounter {
    public int solution (ArrayList<EventTime> events) {
        int maxAttendees =0;
        int currentAttendees = 0;

        Collections.sort(events);
        for (EventTime event : events) {
            if (event.state == 'a') maxAttendees++;
            else maxAttendees--;
            maxAttendees = Math.max(currentAttendees, maxAttendees);
        }
        return maxAttendees;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<EventTime> events = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int departure = scanner.nextInt();
            int arrival = scanner.nextInt();
            events.add(new EventTime(departure, 'd'));
            events.add(new EventTime(arrival, 'a'));
        }
        WeddingAttendeeCounter counter = new WeddingAttendeeCounter();
        System.out.println(counter.solution(events));
    }
}

class EventTime implements Comparable<EventTime>{
    int time;
    char state;

    EventTime(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(EventTime o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}