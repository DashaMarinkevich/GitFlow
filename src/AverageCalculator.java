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
        System.out.println("Среднее: " + AverageMethod(sum,n));
        scanner.close();
    }


    private static double AverageMethod (int sum,int count){
        double avg;
        avg = (double)sum/count;
        return  avg;
    }

}
