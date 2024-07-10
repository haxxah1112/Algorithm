package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeetingRoomScheduler {
    public int solution(ArrayList<Meeting> meetings, int n) {
        int count = 0;
        Collections.sort(meetings);
        int endTime = 0;
        for (Meeting meeting : meetings) {
            if (endTime <= meeting.start) {
                count++;
                endTime = meeting.end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            meetings.add(new Meeting(start, end));
        }

        MeetingRoomScheduler scheduler = new MeetingRoomScheduler();
        System.out.println(scheduler.solution(meetings, n));

    }
}

class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.end == o.end) return this.start - o.start;
        return this.end - o.end;
    }
}