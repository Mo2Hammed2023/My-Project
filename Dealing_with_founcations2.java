package dealing_with_founcations2;

import java.util.Scanner;

public class Dealing_with_founcations2 {
           static Scanner in =new Scanner (System.in);
//   دالة لا تطلب قيمة ولا تعيد قيمة: 
   static void sumA(){
    System.out.println("Enter Any Number : ");
    int n1=in.nextInt();
    System.out.println("Enter Any Number : ");
    int n2=in.nextInt();
        System.out.println("Sum = "+(n1+n2));
    }
//   دالة لا تطلب قيمة وتعيد قيمة: 
    static int sum(){
    System.out.println("Enter Any Number : ");
    int n1=in.nextInt();
    System.out.println("Enter Any Number : ");
    int n2=in.nextInt();
        return (n1+n2);
    }
//    دالة تطلب ولا تعيد قيمة:
    static void muit(int n1,int n2){
        System.out.println("Mult = "+n1*n2);
    }
//    دالة تطلب ولا تعيد قيمة:
    static float div(float n1,float n2){
        return n1/n2;
    }
//   تحدد هل العدد موجب أو سالب:
    static int muitiplied(int n1){
        int Mult=1;
        for (int i = 1; i <= n1; i++) {
            Mult*=i;}
        return Mult;
    }
    
   //   دالة لا تطلب قيمة ولا تعيد قيمة: 
   static boolean sub(){
    System.out.println("Enter Any Number : ");
    int n1=in.nextInt();
    if(n1>=0)
           return true;
    else
           return false;
    } 
    public static void main(String[] args) {
            
        sumA();
        System.out.println("sum = "+sum());
        muit(3,4);
        System.out.println(div(9,3));
        System.out.println(muitiplied(3));
        
        if(sub())
            System.out.println("Positive");
        else
            System.out.println("Negative");
   
    }
    
}
