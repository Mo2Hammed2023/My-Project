package applications_of_while.do_while.for_loop;
public class Applications_of_WhileDo_WhileFor_Loop {
    public static void main(String[] args) {
    int counter=1,sum=0;   
 while (counter!=5){
            System.out.println("Enter X "+counter+" : ");                
         counter=in.nextInt();
         sum =sum+counter;
         }
            System.out.println("sum = "+sum);
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    int number,sum2=0;
            do{
        System.out.println("Enter y");
            number=in.nextInt();
            sum2=sum2+number;}
            while(sum2!=5);
            System.out.println("sum y="+sum2);
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    int numb=0,sum_3=0;
    
            while(numb!=5){
          System.out.println("Enter Value Of X : Or Enter 5 To Stop The Loop : ");
            numb=in.nextInt();
            sum_3=sum_3+numb;
            }
            System.out.println("sum z="+sum_3);
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    int num,sum_2=0;
            do{
          System.out.println("Enter Value Of X : Or Enter 5 To Stop The Loop : ");
            num=in.nextInt();
            sum_2=sum_2+num;
            }while(num!=5);
            System.out.println("sum b="+sum_2);
          
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            int sum_1=0;
            for (int counter1 = 0; counter1 <=10 ; counter1++) {
            if (counter1%2==0)
                sum_1=sum_1+counter1;}
        System.out.println("sum ="+sum_1);
        
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
          for (int counter1 = 0; counter1 <= 10; counter1++) {
            if(counter1==5)
        break;
              System.out.println(counter1);  }
        
          System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
          for (int counter1= 0; counter1 <= 10; counter1++) {
            if(counter1==5)
            continue ;
              System.out.println(counter1);  }
}
    
}
