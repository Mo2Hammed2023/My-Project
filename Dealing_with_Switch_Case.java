package dealing_with_switch_case;

import java.util.Scanner;

public class Dealing_with_Switch_Case {
    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);

// إدخال العمليات الحسابية والقيم بها
System.out.println("Enter x");
int x=in.nextInt();
        System.out.println("Enter y");
int y=in.nextInt();
        System.out.println("Enter one of this operation (*,/,+,-,%)");
int z=in.next().charAt(0);
switch(z){
case '*':
        System.out.println("x*y="+(x+y));
        break;
case '/':
        System.out.println("x/y="+(x/y));
        break;
case '+':
        System.out.println("x+y="+(x+y));
        break;
case '-':
        System.out.println("x-y="+(x-y));
        break;
case '%':
        System.out.println("x*y="+(x%y));
        break;
        default:
                System.out.println("no value");
}

        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        // أدجال رقم بشكل أرقام تـحولها الى شكل حرفي
System.out.println("Enter Any Number :");
  int number=in.nextInt();
  switch(number){      
  case 1:
        System.out.println("one");
        break;
    case 2:
        System.out.println("two");
        break;
    case 3:
        System.out.println("three");
        break;
    default:
        System.out.println("no value");
                }
  

// أدخال الأسم وعدد مرات التكرار//        
System.out.println("Entre Your Name :");
String name=in.nextLine();
        System.out.println("How much?");
int tiems=in.nextInt();
int counter=1;
while(counter<=tiems){
    System.out.println(name);
    counter++;
}
        System.out.println("count ="+counter);
    }
    
}
