package deal_with_elements;

import java.util.Arrays;
import java.util.Scanner;

public class Deal_with_elements_of_array {
public static void main(String[] args) {
Scanner in =new Scanner(System.in);

        System.out.println("Enter The Index :");
        int index=in.nextInt();
        int []array=new int [index];
        float sum=0;
    System.out.println("Enter A Value ");
    for (int element = 0; element <array.length; element++){
        array[element]=in.nextInt();
        sum+=array[element];
    }
    System.out.println("sum = "+sum);
    System.out.println("Avrage = "+sum/array.length);
    
int []array_2=new int [10];
    System.out.println("Enter A Value ");
    for (int row = 0; row < 10; row++) 
        array_2[row]=in.nextInt();
        for (int j = 0; j < 10; j++) 
            System.out.print(array_2[j]+" ");
    
        



//ترتيب الاعدادمن الأصغر الى الأكبر
int array_3[]={2,8,5,3,9};
Arrays.sort(array_3);
    for (int i = 0; i < array_3.length; i++) {        
        System.out.print(array_2[i]+" ");
    }
//أيجاد العدد الأكبر أو الأصغر في المصفوفة
    System.out.println("Enter Number "+1);
        array_2[0]=in.nextInt();
int max=array_2[0];
int mini=array_2[0];
    for (int element = 1; element < array_3.length; element++) {
        System.out.println("Enter Number "+(element+1));
        array_3[element]=in.nextInt();
        if(array_3[element]>max)
            max=array_3[element];
        else if(array_3[element]<mini)
            mini=array_3[element];}
    System.out.println("maximum number is : "+max);
    System.out.println("minimum number is : "+mini); 
}
    
}
