package student_degree_by_arrays;

import java.util.Scanner;

public class Student_degree_by_Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String student_name[] = new String[4];
        int student_degree[][] = new int[4][5];
        int sum[] = new int[4];
        float average[] = new float[4];
        for (int student_counter = 0; student_counter < student_name.length; student_counter++) {
            System.out.println("Enter The name of student number " + (student_counter + 1));
            student_name[student_counter] = in.next();
            System.out.println("Enter the degree for " + student_name[student_counter]);
            for (int degree_counter = 0; degree_counter < 5; degree_counter++) {
                student_degree[student_counter][degree_counter] = in.nextInt();
            }
        }
        for (int student_counter = 0; student_counter < student_name.length; student_counter++) {
            for (int degree_counter = 0; degree_counter < 5; degree_counter++) {
                sum[student_counter] += student_degree[student_counter][degree_counter];
            }
            average[student_counter] = (float) sum[student_counter] / 5;
        }
        for (int student_counter = 0; student_counter < student_name.length; student_counter++) {
            System.out.println("The sun and avrage degree for student " + student_name[student_counter]);
            System.out.println("The sum\t\t Thea vrage");
            System.out.println(sum[student_counter] + "\t\t" + average[student_counter]);
        }
        int temp;
        for (int degree_counter1 = 0; degree_counter1 < sum.length; degree_counter1++) {
            for (int degree_counter2 = 0; degree_counter2 < sum.length; degree_counter2++) {
                if (average[degree_counter1] > average[degree_counter2]) {
                    temp = (int) average[degree_counter1];
                    average[degree_counter1] = average[degree_counter2];
                    average[degree_counter2] = temp;
                }
            }
        }

        for (int degree_counter = 0; degree_counter < sum.length; degree_counter++) {
            System.out.println(sum[degree_counter] + "\t\t" + average[degree_counter]);
        }
    }

}
