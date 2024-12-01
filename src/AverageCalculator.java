import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Среднее: " + average);
        scanner.close();
    }
}
