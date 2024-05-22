package dealing_with_array3;
public class Dealing_with_Arrat3 {
    public static void main(String[] args) {
       int array[][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}};
//    عناصر القطر الرئسي
System.out.println("عناصر القطر الرئسي");
        for (int row = 0; row < array.length; row++) {
            for (int clomun = 0; clomun < array.length; clomun++) {
                if(row==clomun)
                    System.out.print(array[row][clomun]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر القطر الفرعي
System.out.println("عناصر القطر الفرعي");
        for (int row = 0; row < array.length; row++) {
            for (int clomun = 0; clomun < array.length; clomun++) {
                if((row+clomun+1)==array.length)
                    System.out.print(array[row][clomun]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر المثلث السفلي
System.out.println("عناصر المثلث السفلي");
        for (int row = 0; row < array.length; row++) {
            for (int clomun = 0; clomun < array.length; clomun++) {
                if(row>clomun)
                    System.out.print(array[row][clomun]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
//    عناصر المثلث العلوي
System.out.println("عناصر المثلث  العلوي");
        for (int row = 0; row < array.length; row++) {
            for (int clomun = 0; clomun < array.length; clomun++) {
                if(row<clomun)
                    System.out.print(array[row][clomun]+" ");
                else
                    System.out.print("  ");
            }System.out.println(" ");
        }
   
    
    }
    
}
