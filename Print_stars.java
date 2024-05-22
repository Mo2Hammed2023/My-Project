package print_stars;
import java.util.Scanner;
public class Print_stars {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int array_of_stars[]=new int [5];
        System.out.println("Enter The Numbers : ");
        for (int i = 0; i < array_of_stars.length; i++) {
            array_of_stars[i]=in.nextInt();
        }
       
        for (int i = 0; i < array_of_stars.length; i++) {
            for (int j = 0; j <array_of_stars[i]; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
    }
    
}
