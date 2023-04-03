import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] symbols = new int[n];
        for (int i = 0; i < n; i++) {
            symbols[i] = scanner.nextInt();
        }
        int[] rows = new int[n];
        for (int i = 0; i < n; i++) {
            rows[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] text = new int[k];
        for (int i = 0; i < k; i++) {
            text[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i < k; i++) {
            int curr = text[i];
            int prev = text[i-1];
            if (rows[curr-1] != rows[prev-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}