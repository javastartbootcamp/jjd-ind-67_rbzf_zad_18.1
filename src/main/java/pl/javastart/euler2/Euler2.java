package pl.javastart.euler2;

import java.util.Scanner;

public class Euler2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ponizej ktorej chcesz sumowac parzyste elementy ciagu Fibonacciego: ");
        int input = scanner.nextInt();
        int sum = calculateSum(input);
        System.out.println("Suma parzystych elementow ciagu Fibonacciego ponizej " + input + "  wynosi: " + sum);
    }

    public static int calculateSum(int input) {
        int sum = 0;
        int f1 = 0;
        int f2 = 1;
        do {
            int next = f1 + f2;
            if (next <= input && next % 2 == 0) {
                sum += next;
            }
            f1 = f2;
            f2 = next;
        } while (f2 < input);
        return sum;
    }
}
