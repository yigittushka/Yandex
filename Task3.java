import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        List<int[]> buySellDays = new ArrayList<>();

        int buyDay = -1, sellDay = -1;
        for (int i = 0; i < n-1; i++) {
            if (prices[i] < prices[i+1]) {
                if (buyDay == -1) {
                    buyDay = i;
                }
                sellDay = i+1;
            } else if (prices[i] > prices[i+1]) {
                if (buyDay != -1) {
                    buySellDays.add(new int[] {buyDay+1, sellDay+1});
                    buyDay = -1;
                }
            }
        }

        if (buyDay != -1) {
            buySellDays.add(new int[] {buyDay+1, sellDay+1});
        }

        System.out.println(buySellDays.size());
        for (int[] days : buySellDays) {
            System.out.println(days[0] + " " + days[1]);
        }
    }
}
