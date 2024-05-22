package dealing_with_singule_array;

import java.util.Arrays;
import java.util.Scanner;

public class Dealing_with_singule_Array {
    public static void main(String[] args) {
   Scanner in =new Scanner(System.in);

        System.out.println("Enter a index :");
        int index=in.nextInt();
        int []array=new int [index];
        float sum=0;
    System.out.println("Enter A Value ");
    for (int i = 0; i <array.length; i++){
        array[i]=in.nextInt();
        sum+=array[i];
    }
    System.out.println("sum = "+sum);
    System.out.println("Avrage = "+sum/array.length);

    
    
int []array1=new int [10];
    System.out.println("Enter A Value : ");
    for (int limet = 0; limet < 10; limet++) 
        array1[limet]=in.nextInt();
    for (int limet = 0; limet < 10; limet++) 
        System.out.print(array1[limet]+" ");
    

//ترتيب الاعدادمن الأصغر الى الأكبر
int array2[]={2,8,5,3,9};
Arrays.sort(array2);
    for (int limet = 0; limet < array2.length; limet++) {        
        System.out.print(array2[limet]+" ");
    }
//أيجاد العدد الأكبر أو الأصغر في المصفوفة
    System.out.println("Enter Number "+1);
        array2[0]=in.nextInt();
int max=array2[0];
int mini=array2[0];
    for (int limet = 1; limet < array2.length; limet++) {
        System.out.println("Enter Number "+(limet+1));
        array2[limet]=in.nextInt();
        if(array2[limet]>max)
            max=array2[limet];
        else if(array2[limet]<mini)
            mini=array2[limet];}
    System.out.println("maximum number is : "+max);
    System.out.println("minimum number is : "+mini);
    
    }
    
}
