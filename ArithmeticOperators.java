package arithmetic.operators;
public class ArithmeticOperators {
    public static void main(String[] args) {
        
int num_1=10;
int num_2=(5+6)*2;
int num_3 = 5*(2*(2+1));
int num_4 = 2%(5+5)*3;
System.out.println("X = "+num_1);
System.out.println(num_2);
System.out.println(num_3);
System.out.println(num_4);
System.out.println(5+6*2);

    
        System.out.println(15/5);
        System.out.println(15.0/5);
        System.out.println(15/5.0);
        System.out.println(15.0f/2);
        System.out.println(15f/2);
        System.out.println(15/2f);
        System.out.println(15/2.0f);
    
        int num1=9,num2=2 ;
        System.out.println((float)num1/num2); 
        System.out.println((float)12/5); 
        
        int s=1;
        int z=s++;
        System.out.println("X = " + s++ +" "+ ++s +" " + ++s +" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s+" "+ ++s);
        System.out.println("s ="+ ++s);
                
                }
}