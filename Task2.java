import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static List<Integer> idealSculptures(int N, int X, int T, int[] weights) {
        List<Pair> sculptures = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int timeNeeded = Math.abs(X - weights[i]);
            sculptures.add(new Pair(timeNeeded, i));
        }

        sculptures.sort((a, b) -> a.timeNeeded - b.timeNeeded);
        List<Integer> result = new ArrayList<>();
        int totalTime = 0;

        for (Pair pair : sculptures) {
            totalTime += pair.timeNeeded;
            if (totalTime > T) {
                break;
            }
            result.add(pair.index + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        List<Integer> result = idealSculptures(N, X, T, weights);

        System.out.println(result.size());
        for (Integer idx : result) {
            System.out.print(idx + " ");
        }
    }

    static class Pair {
        int timeNeeded;
        int index;

        public Pair(int timeNeeded, int index) {
            this.timeNeeded = timeNeeded;
            this.index = index;
        }
    }
}
