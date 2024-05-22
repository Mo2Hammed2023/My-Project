package student_degrees;

import java.util.Scanner;

public class Student_Degrees {
    public static void main(String[] args) {
     Scanner in=new Scanner (System.in);
        int sum=0,Dagree;
        System.out.println("Enter Number Of Courses : ");
        int Courses=in.nextInt();
        System.out.println("Enter Number Of Students");
        int Student=in.nextInt();
        for (int counter_of_student = 1; counter_of_student <=Student ; counter_of_student++) {
            System.out.println("Enter Student Name number "+counter_of_student+" : ");
            String name=in.nextLine();
            System.out.println("Student : "+name+" His Number"+counter_of_student+".");
            sum=0;
            for (int counter_of_courses = 1; counter_of_courses <= Courses; counter_of_courses++) {
                System.out.println("Enter Dagree Of Course "+counter_of_courses+" : ");
            Dagree=in.nextInt();
            if(Dagree<=100&&Dagree>=0)
                sum=sum+Dagree;
            else{
                    System.out.println("Enter Correct Dagree.");
            counter_of_courses--;}
            }System.out.println("-----------------------------------------");
        System.out.println("Total Of Student"+"("+name+")"+"="+sum);
        System.out.println("Avrage Of Student"+"("+name+")"+"="+sum/Courses);
    if(sum/Courses>=50.0)System.out.println("Sucsseful");
    else    System.out.println("Fail");
        System.out.println("-----------------------------------------");
        }
        
        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        int sum2=0;int num=0;
        for (int i = 1;; i++) {
            System.out.println("Enter Number"+i);
            num=in.nextInt();
            if(num==5)
                break;
        sum2=sum2+num;
        }
        System.out.println("sum ="+sum2);
        System.out.println("sum ="+(sum2+5));
    }
    
}
