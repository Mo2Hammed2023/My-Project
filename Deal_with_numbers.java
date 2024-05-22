package deal_with_numbers;

import java.util.Scanner;

public class Deal_with_numbers {
    public static void main(String[] args) {
        /*
        nextBoolean()
        nextByte()
        nextShort()
        nextInt()
        nextLong()
        nextFloat()
        nextDouble()
        nextLine()
        next()
        */
    Scanner in = new Scanner (System.in);
        System.out.println("Enter number :");
        int number = in.nextInt(); 
        System.out.println("Number ="+number);
    
// -------------********------------- \\

        System.out.println("Enter frist number :");
        float  fristnumber = in.nextFloat();
        System.out.println("Enter second number :");
        float  secondnumber = in.nextFloat();
            System.out.println( "the title = "+(fristnumber+secondnumber));
            
            // -------------********------------- \\
            
        System.out.println("Enter frist number :");
        float fristnumber1,secondnumber1;
        fristnumber1 = in.nextFloat();
        System.out.println("Enter second number :");
        secondnumber1 = in.nextFloat();
            System.out.println( "the title = "+(fristnumber1+secondnumber1));
    
            // -------------********-------------\\
    
        float fristnumber2,secondnumber2;
        System.out.println("Enter frist number :");
        fristnumber2=in.nextFloat();
        System.out.println("Enter second number :");
        secondnumber2=in.nextFloat();
            System.out.println( "num1 ="+fristnumber2 +" "+ "num2 ="+" "+secondnumber2 );    
            System.out.printf("num1 =%f num2 = %f%n",fristnumber2,secondnumber2);    
   }
    
}
