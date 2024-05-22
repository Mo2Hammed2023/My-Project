package deal_with_elements_of_array;
public class Deal_with_elements_of_array {
    public static void main(String[] args) {
       int array[][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}};
//    عناصر القطر الرئسي
System.out.println("The Main Daimeter Elements : ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                if(row==column)
                    System.out.print(array[row][column]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر القطر الفرعي
System.out.println("The Sub_Daimeter Elements : ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                if((row+column+1)==array.length)
                    System.out.print(array[row][column]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر المثلث السفلي
System.out.println("The Low Triangle Elements : ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                if(row>column)
                    System.out.print(array[row][column]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر المثلث العلوي
System.out.println("The High Triangle Elements : ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                if(row<column)
                    System.out.print(array[row][column]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
    }
    
}
