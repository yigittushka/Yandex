import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] minIncomes = new int[N];
        int[] educationRequirements = new int[N];
        int[] childCitizenship = new int[N];

        for (int i = 0; i < N; i++) {
            minIncomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            educationRequirements[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            childCitizenship[i] = scanner.nextInt();
        }

        int Q = scanner.nextInt();
        int[] classmatesIncome = new int[Q];
        int[] classmatesEducation = new int[Q];
        int[] classmatesParents = new int[Q];

        for (int i = 0; i < Q; i++) {
            classmatesIncome[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            classmatesEducation[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            classmatesParents[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int chosenCountry = 0;

            for (int j = 0; j < N; j++) {
                if (classmatesIncome[i] >= minIncomes[j] && (classmatesEducation[i] >= educationRequirements[j] || childCitizenship[j] == 1 && classmatesParents[i] == j + 1)) {
                    chosenCountry = j + 1;
                    break;
                }
            }

            System.out.print(chosenCountry + " ");
        }
    }
}