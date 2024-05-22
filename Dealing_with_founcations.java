package dealing_with_founcations;

import java.util.Scanner;

public class Dealing_with_founcations {
        static  Scanner in=new Scanner (System.in);
// دالة لجمع عددين
    static int sum(int n1,int n2){
    return n1+n2;
    }
    
// دالة لجمع عددين
    static int sum_two_numbers(){
        System.out.println("Enter Num 1 : ");
        int num1=in.nextInt();
        System.out.println("Enter Num 2 : ");
        int num2=in.nextInt();
    return num1+num2;
    }
// دالة لطرح عددين
    static int sub(){
    System.out.println("Enter Num 1 : ");
    int num1=in.nextInt();
    System.out.println("Enter Num 2 : ");
    int num2=in.nextInt();
    return num1-num2;
    }
// دالة لطرح عددين
    static void sum3(){
        System.out.println("Enter Num 1");
        int num1=in.nextInt();
        System.out.println("Enter Num 2");
        int num2=in.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2)); ;
    }
// دالة لضرب عددين
    static int mult(int num1,int num2){
    return num1*num2;
    }
    
   public static int []insertData(int elements[]){
            for (int counter = 0; counter < elements.length; counter++) {
                System.out.println("Enter Num "+(counter+1));
                elements[counter]=in.nextInt();
            }
        return elements;
   }
   
   public static void printData(int elements[]){
            for (int counter = 0; counter < elements.length; counter++) {
                System.out.print(elements[counter]+"\t");
            }System.out.println();
        }
   
   public static int search(int elements[]){
       int location=-1;
       System.out.println("Enter The Num That You Want To Find It : ");
       int num=in.nextInt();
            for (int counter = 0; counter < elements.length; counter++) {
                if (num==elements[counter]) {
                    location++;
                }
            }
            return location;
     }
   public static void update(int elements[]){
   int t=search(elements);
   if(t==-1)System.out.println("Not Found");
   else {
       System.out.println("Found");
       System.out.println("Enter The Number that you want to change it : ");
       int numm=in.nextInt();
       elements[t]=numm;
   }
   }
    public static void main(String[] args) {
        int num_of_oparetion;
        System.out.println("Enter he Size Of Array : ");
        int Size =in.nextInt();
            int array[]=new int[Size];
        do {
            System.out.println("Welcome To Our App");
            System.out.println( "1)Enter The Elements Of Array : \n"
                    + "2)Print The Elements Of Array : \n"
                    + "3)Search for Elements : \n"
                    + "4)Update The Elements Of Array : \n"
                    + "5)Exit : "
                    + "");
            System.out.println("Enter The Number Of Opration : ");
            num_of_oparetion=in.nextInt();
            switch(num_of_oparetion){
                case 1:{
                insertData(array);
                break;
                }
                case 2:{
                printData(array);
                break;
                }
                case 3:{
                search(array);
                break;
                }
                case 4:{
                update(array);
                break;
                }
                default:
                    System.out.println("There is no options .");
                }
        } while (num_of_oparetion!=5);
        
    System.out.println(sum(12,32));
        System.out.println(sum_two_numbers());
        System.out.println(sub());
        sum3();
        System.out.println(mult(2,5));
    }
    
}
