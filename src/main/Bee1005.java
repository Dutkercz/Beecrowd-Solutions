package main;

import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/ (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f%n", media);
    }
}
