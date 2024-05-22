package dealing_with_mothed.arrays;

import java.util.Scanner;

public class Dealing_with_mothedArrays {
    static Scanner in=new Scanner (System.in);
    public static void enter_array(int array[][]){
    System.out.println("Enter The Elements Of Array : ");
                    for (int row = 0; row < array.length; row++) {
                        for (int column = 0; column <array.length; column++) {
                            array[row][column]=in.nextInt();
                            stop();
                        }}}
    
    static void print_array(int ar[][]){
     System.out.println("The Elements Of Array : ");
                    for (int row = 0; row < ar.length; row++) {
                        for (int column = 0; column <ar.length; column++) {
                            System.out.print(ar[row][column]+" ");
                        }System.out.println();
                    }
                    
                    stop();
                    stop();
                    }
    static void search(int [][]array){
        int row = 0,column=0;
    System.out.println("Enter The Number That You Want To Found It : ");
                int num=in.nextInt();
                boolean f=false;
                for (int row_2 = 0; row_2 < array.length; row_2++) {       
                for (int column_2 = 0; column_2 < array.length; column_2++) {
                if (num==array[row_2][column_2]){ 
                    f=true;
                row=row_2;
                column=column_2;
                break;
                }}}   
                if(f){
        System.out.println("Found");
        System.out.println("The Number "+num+" Is Located In Row Number "+(row+1)+" And In The Column Number "+(column+1)+" .");
        stop();
                }
        else
        System.out.println("No Found");}
    
    static void stop(){
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e){}
            }
    
    static void Instead(int a[][]){
    int row = 0,column=0;
                System.out.print("Enter The Number That You Want To Change It : ");
                int num=in.nextInt();
                    System.out.println( );
                int num1;
                boolean f=false;
                for (int row_2 = 0; row_2 < a.length; row_2++) {       
                for (int column_2 = 0; column_2 < a.length; column_2++) {
                if (num==a[row_2][column_2]){ 
                System.out.print("Enter The Number That You Want To Put It Instead Of Number "+num+" : ");
                num1=in.nextInt();
                    a[row_2][column_2]=num1;
                    f=true;
                }else{
                    System.out.println("The Number is not found,choose anther number : ");
                }
                }}}
    
    public static void main(String[] args) {
        
         Scanner in=new Scanner (System.in);
        System.out.print("Enter The Size Of Array : ");
        int size=in.nextInt();
            int num_of_operation;
            int frist_try=1;
            int arr[][]=new int [size][size];
        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1)Enter Array Elemens");
            System.out.println("2)Print Array Elemens");
            System.out.println("3)Search  In Array");
            System.out.println("4)Update Array Elemens");
            System.out.println("5)Exit");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Enter The Number of The Operation : ");
            num_of_operation=in.nextInt();
            if(num_of_operation==1||frist_try!=1)
            switch(num_of_operation){            
                case 1:{
                    enter_array(arr);
                frist_try++;
                    break;}

                case 2:{
                    print_array(arr);
                    break;}
                
                case 3:{
                    search(arr);
                    break;}

                case 4:{
                    Instead(arr);
                    break;}
                
                default:System.out.println("There Is No Option ");}
            else {
                System.out.println("You Should To Enter Number One");}
                stop();
                stop();
        } while (num_of_operation!=5);
    
    }
    
}
