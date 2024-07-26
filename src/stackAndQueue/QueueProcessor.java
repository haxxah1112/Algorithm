package stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class QueueProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            StringTokenizer command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push" :
                    int x = Integer.parseInt(command.nextToken());
                    queue.add(x);
                    break;
                case "pop" :
                    if (queue.isEmpty()) result.append(-1).append('\n');
                    else result.append(queue.poll()).append('\n');
                    break;
                case "size" :
                    result.append(queue.size()).append('\n');
                    break;
                case "empty" :
                    if (queue.isEmpty()) result.append(1).append('\n');
                    else result.append(0).append('\n');
                    break;
                case "front" :
                    if (queue.isEmpty()) result.append(-1).append('\n');
                    else result.append(queue.peek()).append('\n');
                    break;
                case "back" :
                    if (queue.isEmpty()) result.append(-1).append('\n');
                    else result.append(queue.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(result);
    }

}
