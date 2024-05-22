package muitiplier;
import java.util.Scanner;
public class Muitiplier {
    public static void main(String[] args) {
    // أكتب برنامج لأإيخاد المضروب أي عدد طبيعي 
Scanner input=new Scanner (System.in);
int muitiplier,result=1;
        System.out.println("Enter Any Numbers :");
        muitiplier=input.nextInt();
        if (muitiplier>1) {   
        for (int counter=1;counter<=muitiplier;counter++) {//1 2 6 24 120
            result=result*counter;
        }   
            System.out.println("muitiplier number "+muitiplier+" = "+result);
        }else if (muitiplier==0||muitiplier==1) {
        System.out.println("muitiplier number "+muitiplier+" = "+1);
        }else{
            System.out.println("There is no result for number "+muitiplier);
        }
         
            System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
  // جدول الضرب لجميع الأرقام من واحد الى الأثنى عشر          
            for (int number1=1; number1<=12; number1++) 
            for (int number2=1; number2<=12; number2++) {
                int product_of_multiplication=(number1*number2);
                System.out.println(number1+"*"+number2+" ="+product_of_multiplication+"\t");
            }
            
        System.out.println("####$$$$%%%%^^^^&&&&****@@@@");
    //جدول الضرب لاي عدد صحيح
        Scanner nu=new Scanner (System.in);
        System.out.println("Enter Any Number :");
    int a=nu.nextInt();
        for (int b=1; b<=12; b++) {
            System.out.println(a+"*"+b+" ="+(a*b));
            
        }}
    
}
