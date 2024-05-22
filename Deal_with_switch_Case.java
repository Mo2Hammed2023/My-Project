package deal_with_switch_case;

import java.util.Scanner;

public class Deal_with_switch_Case {
    public static void main(String[] args) {
   
    Scanner in=new Scanner (System.in);
        System.out.println("Enter Your Number:");
        int Opration=in.nextInt();
   switch (Opration){
       case 1:
           System.out.println("case # 1:");
           break ;
       case 2:
           System.out.println("case # 2:");
           break ;
       case 3:
           System.out.println("case # 3:");
           break ;
       case 4:
           System.out.println("case # 4:");
           break ;
       case 5:
           System.out.println("case # 5:");
           break;
       default:
           System.out.println("It is not option");}
   
           // ------------ ***** ----------- //
           
           Scanner input=new Scanner (System.in);
           System.out.println("What's is the day in this week?");
           int day =input.nextInt();
           switch(day){
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                   System.out.println("Weekday");
                   break;
               case 6:
               case 7:
                   System.out.println("Weekned");
           }
           
            // ------------ ***** ----------- //
            
            switch(65/9){
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                   System.out.println("Weekday");
                   break;
               case 6:
               case 7:
                   System.out.println("Weekned");}
        
    }
    
}
