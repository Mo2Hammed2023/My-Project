package days_of_the_week;

import java.util.Scanner;

public class Days_of_the_week {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
        System.out.println("Enter Value Of X :");
        int x_value =in.nextInt();
        if (x_value>0)
            System.out.println("y ="+(x_value*x_value*x_value+4));
        else if (x_value==0)
            System.out.println("y ="+5);
        else if(x_value<0)
            System.out.println("y ="+(x_value*x_value*x_value));
        
        Scanner inday=new Scanner(System.in);
        System.out.println("Enter day Number :");
        int day =inday.nextInt();
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
     
        Scanner sal=new Scanner(System.in);
        System.out.println("Enter Your Gander");
        char gender=sal.next().charAt(0);
        System.out.println("Enter Your Salary");
        int salary=sal.nextInt();
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
    }
    
}
