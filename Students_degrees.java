package students_degrees;

import java.util.Scanner;

public class Students_degrees {
    public static void main(String[] args) {
     Scanner in=new Scanner (System.in);
       // count total of student degrrs
        int total=0;
        System.out.println("أدخل درجات الفيزياء :");
        int phsics=in.nextInt();
        total+=phsics;
        if(phsics>=0 & phsics<=100)
        System.out.println("الفيزياء = "+ phsics);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("أدخل درجات الكيمياء:");
        int chemistry=in.nextInt();
        total+=chemistry;
        if(chemistry>=0 & chemistry<=100)
        System.out.println("الكيمياء = "+ chemistry);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("أدخل درجات الأحياء: ");
        int Biology=in.nextInt();
        total+=Biology;
        if(Biology>=0 & Biology<=100)
        System.out.println("الأحياء = "+ Biology);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("أدخل درجات الرياضيات :");
        int math=in.nextInt();
        total+=math;
        if(math>=0 & math<=100)
        System.out.println("الرياضيات = "+ math);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("أدخل درجات القران :");
        int Quren=in.nextInt();
        total+=Quren;
        if(Quren>=0 & Quren<=100)
        System.out.println("القران = "+ Quren);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("أدخل درجات الأسلامية :");
        int Islamic=in.nextInt();
        total+=Islamic;
        if(Islamic>=0 & Islamic<=100)
        System.out.println("الأسلامية = "+ Islamic);
        else
        System.out.println("قيمة خطاء");
        
        System.out.println("Sum = "+(chemistry+phsics+Biology+Quren+Islamic+math));
        int Evg = (chemistry+phsics+Biology+Quren+Islamic+math)/6;
        System.out.println("Evg= "+Evg);
        System.out.println("Or\nSum = "+(total));
         Evg = (total)/6;
        System.out.println("Evg= "+Evg);
        
        if(Evg>=90)
            System.out.println("Ex");
        else if(Evg>=80)
            System.out.println("Vg");
        else if(Evg>=70)
            System.out.println("g");
        else if(Evg>=60)
            System.out.println("pass");
        else if(Evg>=50)
            System.out.println("bad");
        else if(Evg<50)
            System.out.println("file");
    
    // أدخال درجات خمسة طلاب في ثلاث مواد دراسية
        int degree,sum=0;
        for (int counter_of_students = 1; counter_of_students <= 5; counter_of_students++) {
            sum=0;
            for (int counter_of_courses = 1; counter_of_courses <= 3; counter_of_courses++) {
                System.out.println("Enter Degree Of Courses "+counter_of_courses+" : ");
                degree=in.nextInt();
                if(degree>=0 && degree<=100){
                sum=sum+degree;}
                else{
                System.out.println("Error,try again");
                counter_of_courses--;}
            }
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+__+_+_+");
            System.out.println("sum "+counter_of_students+" = "+sum);
            System.out.println("avg "+counter_of_students+" = "+sum/3.0);
            if(sum/3.0>=90)
                System.out.println("Exellent");
            else if(sum/3.0>=80)
                System.out.println("Evry Good");
            else if(sum/3.0>=70)
                System.out.println("Good");
            else if(sum/3.0>=60)
                System.out.println("Acceptable");
            else if(sum/3.0>=50)
                System.out.println("Weak");
            else if(sum/3.0<50)
                System.out.println("Fail");
          System.out.println("+_+_+_+_+_+_+_+_+_+_+_+__+_+_+");
    }
    }
    
}
