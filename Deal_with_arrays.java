package deal_with_arrays;

import java.util.Scanner;

public class Deal_with_arrays {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
        int choose, frist_try=1;
        int array [][]=new int [3][3];
        int num;
        int row_element=0;
        int clomun_element=0;
        
        do {
            System.out.println(" 1- Enter array elements \n 2- print array elements \n 3- search in array \n 4- update in array \n 5- exit");
            System.out.println("Choose number");
            choose = in.nextInt();
            if (choose ==1 || frist_try!=1)
            switch (choose){ 
                case 1: 
                frist_try++;
                System.out.println("Enter array elements");
                for(int i=0; i<3; i++)
                for(int j=0; j<3; j++)
                array [i][j]=in.nextInt();
                break;
                
                case 2:System.out.println("Array elements ");
                for(int i=0; i<3; i++){
                for(int j=0; j<3; j++)
                System.out.print(array[i][j] + "\t");
                System.out.println();}
                break;
                
                case 3:{
                    System.out.println("Enter The Num:");
                num=in.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            if(array[i][j]==num)
                        (clomun_element)++;
                            break;    
                        }
                    row_element++;
                    }
                    row_element--;
                    row_element--;
                    clomun_element++;
                break;
                }
                case 4:{
                    System.out.println(row_element);
                    System.out.println(clomun_element);
                    System.out.println("Enter Num");
                    array[row_element][clomun_element]=in.nextInt();
                }
                case 5: System.out.println("Finsh");
               default : System.out.println("Error, choose number from 1 to 5");
            }
            
        } while (choose !=5);
        
        
    }
    
}
