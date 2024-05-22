package search_in_array;
import java.util.Scanner;
public class Search_in_array {
    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    int array[]=new int[10];
        for (int elements_of_array = 0; elements_of_array < array.length; elements_of_array++) {
            System.out.println("Enter Element "+(1+elements_of_array)+" : ");
            array[elements_of_array]=in.nextInt();
        }
        int location_of_elements=-1;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Enter The Number That You Want To Find It : ");
        int number=in.nextInt();
        
        for (int elements_of_array = 0; elements_of_array < array.length; elements_of_array++) {
        if(array[elements_of_array]==number){
            location_of_elements=(elements_of_array+1);
            break;}
        }
        
        if(location_of_elements!=-1){
            System.out.println("Number "+number+" Is Found In "+location_of_elements+" .");
        }else{
            System.out.println("Not Found");
        }
        
    }
    
}
