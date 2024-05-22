package students_degree_by_archives;

import java.util.Scanner;

class Student{
String name;
int []deg=new int[5];
int sum=0;
double avg=0.0;
}
public class Students_Degree_By_Archives {
    static Scanner in=new Scanner (System.in);

    public static void main(String[] args) {
    
    
   Student []stu = new Student[4];
        for(int j=0;j<4;j++){
            stu[j]= new Student();
            System.out.println("Enter Student Name : ");
        stu[j].name = in.next();
        for(int i =0 ;i<5 ;i++){
            System.out.println("Enter Student Degree : ");
            stu[j].deg[i] = in.nextInt();
            stu[j].sum = stu[j].sum +stu[j].deg[i];
        }
        stu[j].avg = stu[j].sum /5;}
        
        for(int i=0;i<4;i++)
            for(int j = i+1 ;j<4;j++)
                if(stu[i].avg < stu[j].avg){
                    Student temp = stu[i];
                    stu[i]= stu[j];
                    stu[j] = temp;
                }
        for(int j=0;j<4;j++){
        System.out.println("Student name is"+stu[j].name+"\n degree are" );
        for(int i =0 ;i<5 ;i++)
            System.out.print(stu[j].deg[i]+"\t");
         System.out.println("\n sumation ="+stu[j].sum+"\t avg= "+stu[j].avg);}
   
    }
    
}
