package switch_case;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
    
     int number_one=5;
     int number_two;
     int nnumber_three=3;
        System.out.println(number_one);
        System.out.println(nnumber_three);
        number_one=--number_one+nnumber_three--;
        System.out.println(number_one);
        System.out.println(nnumber_three);
        number_two=number_one+++nnumber_three--;
        System.out.println(number_one);
        System.out.println(nnumber_three);
        System.out.println(number_two);
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Number Of (X):");
        int value_of_X =in.nextInt();
        int x=value_of_X;
        if (value_of_X>0)
            System.out.println("y ="+x+"*"+x+"*"+x+"+"+"4 ="+(x*x*x+4));
        else if (value_of_X==0)
            System.out.println("y ="+5);
        else if(value_of_X<0)
            System.out.println("y ="+x+"*"+x+"*"+x+"="+(x*x*x));
        
        
        System.out.println("Enter day Number :");
        int day =in.nextInt();
        switch(day){
            case 1:
                System.out.println("Friday");
            case 2:
                System.out.println("Saturday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuseday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
                default :
        System.out.println("No Value");}
        
        
        System.out.println("Enter Charcter Your Gander (M Or F):");
        char gender=in.next().charAt(0);
        System.out.println("Enter Your Salary");
        int salary=in.nextInt();
        switch(gender){
            case 'm':
            case 'M':
                System.out.println("The salary ="+(salary+100));
                break;
            case 'f':
            case 'F':
                System.out.println("The salary ="+(salary+50));
                break;
                default :
                System.out.println("No Value");
                break;}
        
        int num1=5,num2=5;
        System.out.println((num1==num2)?"Good":"Bad");
        
        int number1;
        int number2;
        int number3;
        number1=number2=5;
        number3=(number1==number2)?5:6;
        System.out.println(number3);
    }
}
