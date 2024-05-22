package student_degree_by_using_arrays;

import java.util.Scanner;

public class Student_degree_by_using_Arrays {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
/* 
    Student Name : Mohammed Hamid Saead
    Softwear Engineering Department
*/
    System.out.println("Enter The Number Of Student : ");
        int student_number=in.nextInt();
    System.out.println("Enter The Number Of Studying Subjects : ");
        int subjects_number=in.nextInt();
   
    String student_name[]=new String[student_number];
    String Subjects_name[]=new String[subjects_number];
    int student_degree[][]=new int[student_number][subjects_number];
    float sum[]=new float[student_number];
    float average[]=new float[student_number];
        for (int i = 0; i < subjects_number; i++) {
            System.out.println("Enter The Name Of Subject "+(i+1)+" : ");
            Subjects_name[i]=in.next();
        }
        for (int i = 0; i <student_name.length ; i++) {
            student_name[i]=in.nextLine();
            System.out.println("Enter The Full Name For student number "+(i+1)+" : ");
            student_name[i]=in.nextLine();
            for (int j = 0; j < subjects_number ; j++) {
            System.out.println("Enter "+student_name[i]+"'s degree in "+Subjects_name[j]+" : ");
                student_degree[i][j]=in.nextInt();
        }}
        
        for (int i = 0; i <student_name.length ; i++) {
            for (int j = 0; j < subjects_number ; j++) {
                sum[i]+=student_degree[i][j];
            }
            average[i]=(sum[i]/subjects_number);
        }
    int counter[]=new int[student_number];    
    for (int i = 0; i < student_number; i++) {
        counter[i]=i;        
    }
    
    int t;
    for (int i = 0; i < sum.length; i++) {
        for (int j = 0; j < sum.length - 1 - i; j++) {
            if (sum[counter[j]] < sum[counter[j + 1]]) {
                t = counter[j];
                counter[j] = counter[j + 1];
                counter[j + 1] = t;
    }}}
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|| No || Student Name\t\t|| The Total Scores \t||\t Average\t||");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  for (int i=0; i<sum.length; i++){
  System.out.println("|| "+(i+1)+"  || "+student_name[counter[i]]+"\t\t"+(int)sum[counter[i]]+"\t\t\t"+average[counter[i]]+" \t\t||");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");}
}
    
}
