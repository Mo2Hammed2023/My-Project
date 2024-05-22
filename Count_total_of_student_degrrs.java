package count_total_of_student_degrrs;

import java.util.Scanner;

public class Count_total_of_student_degrrs {
    public static void main(String[] args) {
     Scanner in=new Scanner (System.in);
       // count total of student degrees
       int student_passing=1; 
       int total=0;
        System.out.println("أدخل درجة الفيزباء :");
        int physics_degree=in.nextInt();
        if(physics_degree>=0 & physics_degree<=100){
        System.out.println("الفيزياء = "+physics_degree );
        total+=physics_degree;
        }else{
        total+=physics_degree;
        System.out.println("قيمة خاطئة.");
        student_passing+=1;
        }
        
        System.out.println("أدخل درجة الكيمياء :");
        int chemistry_degree=in.nextInt();
        if(chemistry_degree>=0 & chemistry_degree<=100){
        System.out.println("الكيمياء = "+chemistry_degree );
        total+=chemistry_degree;
        }else{
        total+=chemistry_degree;
        System.out.println("قيمة خاطئة.");
        student_passing+=1;
        }
        
        System.out.println("أدخل درجات الأحياء: ");
        int biology_deree=in.nextInt();
        if(biology_deree>=0 & biology_deree<=100){
        System.out.println("الأحياء = "+ biology_deree);
        total+=biology_deree;
        }
        else
        {
        System.out.println("قيمة خاطئة");
        total+=biology_deree;
        student_passing+=1;
        }
        
        System.out.println("أدخل درجات الرياضيات :");
        int math_degree=in.nextInt();
        if(math_degree>=0 & math_degree<=100){
        System.out.println("الرياضيات = "+ math_degree);
        total+=math_degree;
        }
        else{
        System.out.println("قيمة خاطئة");
        total+=math_degree;
        }
        
        System.out.println("أدخل درجات القران :");
        int quran_degree=in.nextInt();
        if(quran_degree>=0 & quran_degree<=100){
        System.out.println("القران = "+ quran_degree);
        total+=quran_degree;
        }
        else{
        total+=quran_degree;
        total+=quran_degree;
        System.out.println("قيمة خاطئة");
        student_passing+=1;
        }
        
        System.out.println("أدخل درجات الأسلامية :");
        int islamic_degree=in.nextInt();
        if(islamic_degree>=0 & islamic_degree<=100){
        System.out.println("الأسلامية = "+ islamic_degree);
        total+=islamic_degree;
        }
        else{
        total+=islamic_degree;
        student_passing+=1;
        System.out.println("قيمة خاطئة");
        }
        
        System.out.println("محموع الدرجات = "+total);
        float Evg = (float)(total/6.0);
        System.out.println("المتوسط= "+Evg);
        if (student_passing==0) {   
        if(Evg>=90)
            System.out.println("ممتاز");
        else if(Evg>=80)
            System.out.println("جيد جدا");
        else if(Evg>=70)
            System.out.println("جيد");
        else if(Evg>=60)
            System.out.println("مقبول");
        }else{ 
            System.out.println("راسب في "+student_passing+" مقررات");}
//if(Evg<60)
    // أدخال درجات خمسة طلاب في ثلاث مواد دراسية
        int x,sum=0;
        for (int num_of_student = 1; num_of_student <= 5; num_of_student++) {
            sum=0;
            for (int num_of_subjects = 1; num_of_subjects <= 3; num_of_subjects++) {
                System.out.println("Enter x"+num_of_subjects);
                x=in.nextInt();
                if(x>=0 && x<=100){
                sum=sum+x;}
                else{
                System.out.println("Error,try again");
                num_of_subjects--;}
            }
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+__+_+_+");
            System.out.println("sum "+num_of_student+" = "+sum);
            System.out.println("avg "+num_of_student+" = "+sum/3.0);
            if(sum/3.0>=90)
                System.out.println("ممتاز");
            else if(sum/3.0>=80)
                System.out.println("جيد جدا");
            else if(sum/3.0>=70)
                System.out.println("جيد");
            else if(sum/3.0>=60)
                System.out.println("مقبول");
            else if(sum/3.0>=50)
                System.out.println("ضعيف");
            else if(sum/3.0<50)
                System.out.println("رأسب");
          System.out.println("+_+_+_+_+_+_+_+_+_+_+_+__+_+_+");
    }}
    
}
