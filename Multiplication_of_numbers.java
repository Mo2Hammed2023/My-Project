package multiplication_of_numbers;

import java.util.Scanner;

public class Multiplication_of_numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //المضروب
        double number, mult = 1;
        System.out.println("Enter x");
        number = in.nextInt();
        for (int counter = 1; counter <= number; counter++) {//1
            mult = mult * counter;
        }
        System.out.println(mult);

        System.out.println("#####################");
//        for (int counter1 =1; counter1<= 5; counter1++) {
//        for (int j =1; j<= 5; j++) {
//                System.out.println("name"+"\t");
//            }System.out.print(" ");}
        System.out.println("#####################");
        for (int counter1 = 1; counter1 <= 5; counter1++) {
            for (int counter2 = 1; counter2 <= 5; counter2++) {
                System.out.print(counter1);
            }
            System.out.println("\n");
        }

        System.out.println("#####################");
        for (int counter_1 = 1; counter_1 <= 12; counter_1++) {
            for (int counter_2 = 1; counter_2 <= counter_1; counter_2++) {
                System.out.print(counter_1 + "*" + counter_2 + " =" + (counter_1 * counter_2) + "," + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("#####################");

        System.out.println("Enter number :");
        int num = in.nextInt();
        for (int counter = 1; counter <= 12; counter++) {
            System.out.println(counter + "*" + num + " = " + (counter * num));
        }
    }

}
