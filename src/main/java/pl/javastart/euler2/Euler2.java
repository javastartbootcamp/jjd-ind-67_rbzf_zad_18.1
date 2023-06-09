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
        int sum = 2;
        int f1 = 1;
        int f2 = 2;
        int next;
        do {
            next = f1 + f2;
            if (next > input) {
                break;
            } else if (next % 2 == 0) {
                sum += next;
            }
            f1 = f2;
            f2 = next;
        } while (next < input);
        return sum;
    }
}
