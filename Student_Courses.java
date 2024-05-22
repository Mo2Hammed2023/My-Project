package student_courses;

import java.util.Scanner;

public class Student_Courses {
    static int sum(int num1,int num2,int num3){
 int sum=num1+num2+num3;
 return sum;
}
    public static void main(String[] args) {
         System.out.println(sum(33,5,55));
  Scanner in=new Scanner (System.in);  
  int degree,sum=0,avg;
        for (int i = 1; i <= 5; i++) {
            sum=0;
            for (int j = 1; j <=3 ; j++) {
                System.out.println("Enter x"+j);
                degree=in.nextInt();
                if(degree>=0&&degree<=100){
                sum=sum+degree;
                avg=sum/3;}
                else
                    System.out.println("Error");
                    ++j;
            }
            System.out.println("sum ="+sum);
            System.out.println("avg ="+sum/3.0);
            if((sum/3)>=90)
                System.out.println("ممتاز");
            else if((sum/3)>=80)
                System.out.println("جيد جدا");
            else if((sum/3)>=70)
                System.out.println("جيد ");
            else if((sum/3)>=60)
                System.out.println("مقبول");
            else if((sum/3)>=50)
                System.out.println("ضعيف");
            else if((sum/3)<50)
                System.out.println("رأسب");}
        int sum1 =0; int x1;
        for (int i = 1; i <=2; i++) {
            sum1=0;
            for (int j = 1; j <=3; j++) {
                System.out.println("Enter x"+j);
               x1=in.nextInt();
                sum1+=x1;
            }System.out.println("sum "+i+" = "+sum1);
        }
    }
    
}
