package mult_of_arrays;

import java.util.Scanner;

public class Mult_of_arrays {

    public static void main(String[] args) {
Scanner in=new Scanner (System.in);

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");  
System.out.println("Enter The Row Of The Frist Array ");        
        int Row_Of_The_Frist=in.nextInt();
System.out.println("Enter The Colunm Of The Frist Array ");        
        int Colunm_Of_The_Frist=in.nextInt();
        int Array1[][]=new int[Row_Of_The_Frist][Colunm_Of_The_Frist];
        System.out.println("Enter The Elements of the frist array, Please : ");
        for (int row = 0; row <Row_Of_The_Frist ; row++) {
            for (int j = 0; j <Colunm_Of_The_Frist ; j++) {
                Array1[row][j]=in.nextInt();}}
        
System.out.println("Enter The Row Of The Second Array ");        
        int Row_Of_The_Second=in.nextInt();
System.out.println("Enter The Colunm Of The Second Array ");        
        int Colunm_Of_The_Second=in.nextInt();
        int Array2[][]=new int [Row_Of_The_Second][Colunm_Of_The_Second];
        System.out.println("Enter The Elements of the second array, Please : ");
        for (int row = 0; row <Row_Of_The_Frist ; row++) {
            for (int colunm = 0; colunm <Colunm_Of_The_Frist ; colunm++) {
                Array2[row][colunm]=in.nextInt();}}
        int Array3[][]=new int[Row_Of_The_Frist][Colunm_Of_The_Frist];
        
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1.length; j++) {
                for (int k = 0; k < Array1.length; k++) {
                    for (int l = 0; l < Array1.length; l++) {           
                    Array3[i][j]+=(Array1[i][k]*Array2[k][l]);  
                    }
                }}}
        for (int row = 0; row < Row_Of_The_Frist; row++) {
            for (int Colunm = 0; Colunm < Colunm_Of_The_Frist; Colunm++) {
                System.out.print(Array3[row][Colunm]+" ");
            }System.out.println( );}
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");    
 
    }

}
