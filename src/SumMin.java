import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть A");
        int A = scanner.nextInt();
        System.out.println("Введіть B");
        int B = scanner.nextInt();
        int sum = 0;
        System.out.println("Непарні числа");
        for (int i = A + 1; i < B; i++) {
            sum += i;
            if (i % 2 != 0) System.out.println(i);
        }
        System.out.println("Сума чисел - " + sum);
    }
}
