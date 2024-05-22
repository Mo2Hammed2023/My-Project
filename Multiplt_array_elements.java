package multiplt_array_elements;
import java.util.Scanner;
public class Multiplt_array_elements {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        int array[]=new int[12];
         for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
           array[element_of_array]=1+element_of_array;
        }
         System.out.println("Ente Number That You Want To Multiply It : ");
         int number=in.nextInt();
         for (int element_of_array = 0; element_of_array < array.length; element_of_array++) {
             System.out.println((1+element_of_array)+" * "+number+" = "+(array[element_of_array]*number));
        }
    }}
