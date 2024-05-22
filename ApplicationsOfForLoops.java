package applications.of.pkgfor.loops;

import java.util.Scanner;

public class ApplicationsOfForLoops {

    public static void main(String[] args) {
        int stop_point = 10;
        for (int counter = 1; counter <= stop_point; counter++) {
            System.out.println(counter);
        }
        System.out.println("##########");

        for (int counter = 1; counter <= stop_point; counter++) {
            System.out.println("Ali");
        }
        System.out.println("##########");

        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
        }
        System.out.println("##########");

        for (int counter = 1; counter <= 100; counter++) {
            System.out.println(counter);
        }
        System.out.println("##########");

        int sum = 0;
        for (int counter = 1; counter <= 100; counter++) {
            sum = sum + counter;
        }
        System.out.println(sum);

        System.out.println("##########");
        int sum1 = 0;
//        for (int j = 1; j <= 100; j+=2) {
        for (int counter = 1; counter <= 100; counter += 2) {
            sum1 = sum1 + counter;
        }
        System.out.println(sum1);

        System.out.println("##########");

        Scanner in = new Scanner(System.in);
        int sum_1 = 0, numbers;
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Enter x " + counter);
            numbers = in.nextInt();
            sum_1 = sum_1 + numbers;
        }
        System.out.println("sm =" + sum_1);
        System.out.println(" avrag =" + sum_1 / 5.0);

        System.out.println("##########");

        int Exponent, Foundations, mult = 1;
        System.out.println("Enter The Exponent : ");
        Exponent = in.nextInt();
        System.out.println("Enter The Foundations : ");
        Foundations = in.nextInt();
        for (int i = 1; i <= Foundations; i++) {
            mult = mult * Exponent;
        }
        System.out.println(mult);
    }
}
