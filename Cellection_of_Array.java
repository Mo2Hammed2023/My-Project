package cellection_of_array;
import java.util.Scanner;
public class Cellection_of_Array {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int size=in.nextInt();
        int array[]=new int[size];
        int sum=0;
        float average;
        for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
            System.out.println("Enter Element "+(1+element_of_array)+" : ");
            array[element_of_array]=in.nextInt();
            sum+=array[element_of_array];
        }
        average=(float)sum/array.length;
        System.out.println("The Cellection = "+sum);
        System.out.println("The Avrage = "+average);
    
        int max=array[0];
        int min=array[0];
        
        for (int element_of_array = 0; element_of_array < array.length; element_of_array++) 
            System.out.println("Value Of Element "+(element_of_array+1)+" = "+array[element_of_array]);
      
        for (int element_of_array = 1; element_of_array < array.length; element_of_array++){
        if(max<array[element_of_array])
                max=array[element_of_array];
            if(min>array[element_of_array])
                min=array[element_of_array];
            } 
        System.out.println("The Maximum Number is : "+max);
        System.out.println("The Minumal Number is : "+min);
        
        for (int element_of_array = 0; element_of_array < array.length; element_of_array++){
        for (int element_of_array2 = 0; element_of_array2 < array.length; element_of_array2++){
            if (array[element_of_array]>array[element_of_array2]) {
            int temp=array[element_of_array];
            array[element_of_array]=array[element_of_array2];
            array[element_of_array2]=temp;
            }}}
        System.out.println("Sort Of Elements Are : ");
        for (int element_of_array = 0; element_of_array < array.length; element_of_array++){
            System.out.println(array[element_of_array]);
        
    }
}
