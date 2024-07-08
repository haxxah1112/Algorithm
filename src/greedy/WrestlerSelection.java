package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WrestlerSelection {
    public int solution(ArrayList<Body> bodies, int n) {
        int count = 0;
        Collections.sort(bodies);
        int maxWeight = Integer.MIN_VALUE;
        for (Body body : bodies) {
            if (body.weight > maxWeight) {
                maxWeight = body.weight;
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr.add(new Body(height, weight));
        }

        WrestlerSelection wrestlerSelection = new WrestlerSelection();
        System.out.println(wrestlerSelection.solution(arr, n));
    }
}

class Body implements Comparable<Body> {
    int height;
    int weight;

    Body(int h, int w) {
        this.height = h;
        this.weight = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}