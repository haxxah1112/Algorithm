package dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int surfaceArea, height, weight;
    Brick(int s, int height, int weight) {
        this.surfaceArea = s;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.surfaceArea - this.surfaceArea;
    }
}
public class TallestTowerBuilder {
    static int[] brickHeight;

    public int solution(ArrayList<Brick> arr) {
        Collections.sort(arr);
        brickHeight[0] = arr.get(0).height;
        int answer = brickHeight[0];

        for (int i=1; i<arr.size(); i++) {
            int maxHeight = 0;
            for (int j=i; j>=0; j--) {
                if (arr.get(j).weight > arr.get(i).weight && brickHeight[j] > maxHeight) {
                    maxHeight = brickHeight[j];
                }
            }
            brickHeight[i] = maxHeight + arr.get(i).height;
            answer = Math.max(answer, brickHeight[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        brickHeight = new int[n];
        for (int i=0; i<n; i++) {
            int surfaceArea = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr.add(new Brick(surfaceArea, height, weight));
        }
        TallestTowerBuilder builder = new TallestTowerBuilder();
        System.out.println(builder.solution(arr));
    }
}
