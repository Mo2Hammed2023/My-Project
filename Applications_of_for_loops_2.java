package applications_of_for_loops_2;

import java.util.Scanner;

public class Applications_of_for_loops_2 {
    public static void main(String[] args) {
       // أكتب أسمك خمس مرات //
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Mohammed Hamid");}
       System.out.println("####$$$$%%%%^^^^&&&&****@@@@");

        // أكتب الأعداد الفردية من واحد الى المائة//
        for (int counter = 1; counter <= 100; counter++) 
           { if (counter%2!=0)
                System.out.println(counter);
        }
        
        System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
        
    // أكتب مجموع الأعداد الزوجية من أثنين الى المائة//
    int sum=0 ;
    for (int counter = 2; counter <= 100; counter+=2) {
             sum=sum+counter;
        }System.out.println(sum);
    
            System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
    // أكتب مضاعفات الثلاثة //
        for (int counter = 0; counter <=100; counter+=3) {
            System.out.println(counter);}
    
         System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
        //أكتب برنامج أدخال خمس مقرارت وأيجادالمتوسط // 
       Scanner in=new Scanner (System.in);
        int sum_of_courses=0,courses;
        for (int counter_of_courses = 1; counter_of_courses<= 5; counter_of_courses++) {
          System.out.println("Enter Yuor Dagry");
            courses=in.nextInt();
            sum_of_courses=sum_of_courses+courses;}
        System.out.println(sum_of_courses/5);
    
    System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
    // أكتب برنامج لأيجاد المعدلة التالية Y=x^(Z)
    
    Scanner input=new Scanner (System.in);
        System.out.println("    أكتب برنامج لأيجاد المعدلة التالية Y=x^(Z)");
    int X,Z,Y;
          Y=1;
           System.out.println("Enter Value Of X");
           X=input.nextInt();
          System.out.println("Enter Value Of Z");
           Z=input.nextInt();
           for (int COUNTER = 1; COUNTER <= Z; COUNTER++) {
            Y=Y*X;
           }System.out.println(Y);
           
    }
    
}
