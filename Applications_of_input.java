package applications_of_input;

import java.util.Scanner;

public class Applications_of_input {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.println("Enter Frist Number :");
        double frist_number= input.nextDouble();
        System.out.println(frist_number);
        // =========== ***** =========== //
        Scanner input_name = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = input_name.nextLine();
        System.out.println(name);
      // =========== ***** =========== //
      Scanner input_1=new Scanner(System.in);
       System.out.println("Enter your Frist Number :");
        double frist_num=input_1.nextDouble();
      
        Scanner input_2=new Scanner(System.in);
        System.out.println("Enter Your Second Number :");
        double sec_num =input_2.nextDouble();
        
        System.out.println("The Totla ="+(frist_num+sec_num));
        
              // =========== ***** =========== //
              
       Scanner in=new Scanner (System.in);
       float frist_number1,second_number2,sum;
        System.out.println("Enter Frist Number :");
        frist_number1=in.nextFloat();
        System.out.println("Enter Second Number :");
        second_number2= in.nextFloat();
        sum=frist_number1+second_number2;
        System.out.println("Sum = "+(frist_number1+second_number2));
        System.out.println("sum = "+sum);
        
        
        System.out.println("Avg ="+(frist_number1+second_number2)/2);
        System.out.println("Avg ="+sum/2);
        
        System.out.println("num1 = "+ frist_number1+" "+"num2 ="+ second_number2);
        System.out.printf("num1 =%.2f num2 =%.2f%n  ",frist_number1,second_number2);
        
             // =========== ***** =========== //
                
        System.out.println("Enter Your Name :");
        char latter = in.next().charAt(0);
        System.out.printf("Latter =%s",latter);

            // =========== ***** =========== //
            System.out.println();
            for (char counter_of_charcter = 0; counter_of_charcter < 120; counter_of_charcter++) {
                System.out.println(counter_of_charcter);
        }}
    
}
