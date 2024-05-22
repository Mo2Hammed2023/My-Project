package password;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
     Scanner input =new Scanner (System.in);  
     
    int user_password=1234;
        for (int tries = 0; tries <= 2; tries++) {
            System.out.println("Enter Your Password");
        int password=input.nextInt();
        if(user_password==password){
            int scale_of_type_num=0;
        System.out.println("Wolcame Mr/Miss");       
        System.out.println("Enter Number : ");
        int number=input.nextInt();
        for (int counter = 2; counter < number; counter++) 
            if(number%counter==0)
        scale_of_type_num++;
        if((scale_of_type_num==0))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
     break;
        }
        else{
            System.out.println("Enter The Password Agine.");}
        }
    
        

int rows = 4;
for (int num_of_rows = 1; num_of_rows <= rows; num_of_rows++) {
    for (int num_of_spaee = 1; num_of_spaee <= rows - num_of_rows; num_of_spaee++) {
        System.out.print(" ");}
    for (int num_of_stars = 1; num_of_stars <= num_of_rows; num_of_stars++) {
        System.out.print("*");
        }
        System.out.println();
    }

    }
}
