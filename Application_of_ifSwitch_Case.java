package application_of_if.switch_case;

import java.util.Scanner;
public class Application_of_ifSwitch_Case {
    public static void main(String[] args) {
Scanner in=new Scanner (System.in);
          char ch='a';
       switch(ch){
       case'a':
               System.out.println(ch); 
       case'A':
      System.out.println(ch);         
       }
         
        System.out.println("Enter Three Numbers To print The Maximum Number: ");
int the_frist_number=in.nextInt();
int the_second_number=in.nextInt();
int the_third_number=in.nextInt();
   if (the_frist_number>the_second_number&&the_frist_number>the_third_number)
            System.out.println(the_frist_number);
   else if (the_second_number>the_frist_number&&the_second_number>the_third_number)
            System.out.println(the_second_number);
   else if (the_third_number>the_frist_number&&the_third_number>the_second_number)
            System.out.println(the_third_number);

        System.out.println("#8#8#8#8#8#8#8#8#8#8#8#8#");
   
        System.out.println("Enter Three Numbers To print The Minumal Number: ");
the_frist_number=in.nextInt();
the_second_number=in.nextInt();
the_third_number=in.nextInt();
   if (the_frist_number<the_second_number&&the_frist_number<the_third_number)
            System.out.println(the_frist_number);
   else if (the_second_number<the_frist_number&&the_second_number<the_third_number)
            System.out.println(the_second_number);
   else if (the_third_number<the_frist_number&&the_third_number<the_second_number)
            System.out.println(the_third_number);

        System.out.println("#8#8#8#8#8#8#8#8#8#8#8#8#");     
   
    int max =0;
        for (int counter = 1; counter <= 10; counter++) {
        System.out.println("Enter Number"+(counter+1)+" To print The Minumal Number: ");
            int nunber=in.nextInt();
            if(nunber>max)
            max=nunber;
        }System.out.println(max);}
    
}
