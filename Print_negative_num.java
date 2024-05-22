package print_negative_num;

import java.util.Scanner;

public class Print_negative_num {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int size=in.nextInt();
        int array[]=new int[size];
         for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
            System.out.println("Enter Element "+(1+element_of_array)+" : ");
            array[element_of_array]=in.nextInt();
        }
         System.out.println("The Negative Numbers Are : ");
         for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
         if(array[element_of_array]<0)
                 System.out.println(array[element_of_array]);
         }
         
         System.out.println("The Positiv Numbers Are : ");
         for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
         if(array[element_of_array]>=0)
                 System.out.println(array[element_of_array]);
         }
        
        
    }
    
}
