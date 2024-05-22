package tasting_element;

import java.util.Scanner;

public class Tasting_element {
    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    int array[]=new int[10];
        for (int elements_of_array = 0; elements_of_array < array.length; elements_of_array++) {
            System.out.println("Enter Element "+(1+elements_of_array)+" : ");
            array[elements_of_array]=in.nextInt();
        }
        System.out.println("Negative And Odd Number : ");
        for (int elements_of_array = 0; elements_of_array < array.length; elements_of_array++) {
            if(array[elements_of_array]<0&&array[elements_of_array]%2==0)
                System.out.println(array[elements_of_array]);
    }
    
}}
