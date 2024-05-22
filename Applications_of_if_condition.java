package applications_of_if_condition;

import java.util.Scanner;

public class Applications_of_if_condition {
    public static void main(String[] args) {
       Scanner in =new Scanner (System.in);   
    int mult=1;    
    System.out.println("Enter Any Number ");
        int number=in.nextInt();
        for (int counter = 1; counter <= number; counter++) {
            mult=mult*counter;
        }System.out.println(mult);
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=-");
// التعامل مع الأشارات
    int s=23;  int y=s++; int a=s++;    int x=++s; int q=s--; int w=s--; int p=--s;
        System.out.println(y);
        System.out.println(a);
        System.out.println(x);
        System.out.println(q);
        System.out.println(w);
        System.out.println(p);
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        /*
        *
        **
        ***
        ****    بستخدام المتغيرات من نوع char
        */
    char stars='*';
      System.out.println(stars+"\n"+stars+stars+"\n"+stars+stars+stars+"\n"+stars+stars+stars+stars+"\n"+stars+stars+stars+stars+stars);
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        for (int counter_of_stars = 1; counter_of_stars <=5; counter_of_stars++) {
            for (int num_of_stars = 1; num_of_stars <= counter_of_stars; num_of_stars++) {
      System.out.print(stars);}
      System.out.println(" ");};
      
      double double_num=123.56;
      System.out.println(double_num);
      
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
      System.out.println("Enter Your Degree:");
          int deg=in.nextInt();
          if(deg>=50&&deg<=100)System.out.println("pass");
          else if(deg<50&&deg>0)System.out.println("faile");
          else {System.out.println("Wrong Value");deg++;}
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");    
// برنامج يستقبل درجات عشرة طلاب في خمس مواد درأسية ويحدد أذا كان الطالب ناجح   
    int sum=0,courses;
        for (int i = 1; i <= 10; i++) {
            sum=0;
            for (int j =1 ; j<=5; j++) {
                System.out.println("Enter Your Degree in #"+j);
                courses=in.nextInt();
                if(courses>=50&&courses<=100){
                    sum+=courses;}
                else if(courses>100){
                    System.out.println("Wrong Value");
                  ++courses;
                }
            }
            System.out.println("Sum ="+sum);
            System.out.println("Avrage ="+sum/5.0);}  
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        //برنامج يستقبل عددين ويطبع الأكبر//
        System.out.println("Enter Any Number :");
        int num1=in.nextInt();
        System.out.println("Enter Any Number :");
        int num2=in.nextInt();
        if(num1>num2) System.out.println(num1);
        if(num1<num2) System.out.println(num2);
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        //برنامج يحدد هل العدد موجب أو سالب//
        System.out.println("Enter Any Number :");
        int num_1=in.nextInt();
        if(num_1>0) System.out.println("Number "+num_1+" is positive number");
        if(num_1<0) System.out.println("Number "+num_1+" is Negative number");
        if(num_1==0) System.out.println("Number "+num_1+" is neuttal collective");
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        //برنامج يحدد هل العدد فردي زوجي//
        System.out.println("Enter Any Number :");
        int num=in.nextInt();
        if(num%2==0) System.out.println("Number "+num_1+" is even number");
        if(num%2!=0) System.out.println("Number "+num_1+" is odd number"); 
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        //برنامج يقوم بهذا العمليات //
        System.out.println("Enter Any Number :");
        int nu=in.nextInt();
        if(nu==0) System.out.println("y "+nu+" is even number");
        if(nu%2!=0) System.out.println("Number "+num_1+" is odd number"); 
      System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
// حساب روات الموظفيين        
        System.out.println("Enter Your Gander");
        char gander=in.next().charAt(0);
        System.out.println("Enter Your Salery");
        int sal=in.nextInt();
     switch(gander){
         case 'm':
         case 'M':{
             System.out.println("The salery = "+(sal+100));
         }break;
         case 'f':
         case 'F':{
             System.out.println("The salery = "+(sal+50));
         }break;
         default:
             System.out.println("error");}
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        int number1=3;
        int number2=3;
        int number3=(number1==number2)?5:6;
        System.out.println(number3);
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        int number_1=3;int number_2=5;
        System.out.println((number_1==number_2)?"good":"bad");
    }
}
