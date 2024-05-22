package build_caclulator_by_founcations;

import java.util.Scanner;

public class Build_Caclulator_By_founcations {
        static int sum(int n1,int n2){
    return n1+n2;
    }
    
    static void sub(int n1,int n2){
        System.out.println(n1+"-"+n2+" = "+(n1-n2));
    }
    
    static int mult(){
        System.out.println("Enter Num 1 : ");
            int n1=in.nextInt();
                System.out.println("Enter Num 2 : ");
            int n2=in.nextInt();
            System.out.print(n1+"*"+n2+" = ");
    return n1*n2;
    }
    
    static void div(){
                System.out.println("Enter Num 1 :");
            int n1=in.nextInt();
                System.out.println("Enter Num 2 : ");
            int n2=in.nextInt();        
                System.out.println(n1+"/"+n2+" = "+(double)(n1/n2));
    }
    
    static Scanner in =new Scanner (System.in);
    public static void main(String[] args) {
        char choose;   
        System.out.println("Enter (*,+,-,/) : ");
        choose=in.next().charAt(0);
        switch(choose){
            case '+':{
                System.out.println("Enter Num 1 : ");
            int n1=in.nextInt();
                System.out.println("Enter Num 2 : ");
            int n2=in.nextInt();
            System.out.println(n1+"+"+n2+" = "+sum(n1,n2));
            break;
            }
            case '-':{
                System.out.println("Enter Num 1 : ");
            int n1=in.nextInt();
                System.out.println("Enter Num 2 : ");
            int n2=in.nextInt();
                sub(n1,n2);
            break;
            }
            case '*':{
                System.out.println(mult());
            break;
            }
            case '/':{
                div();
            break;
            }
            
        }}
    
}
