package librarys;

import java.util.Scanner;

 class student{
    int ID;
    String name;
    int age;
    char gander;
    }
    class Book{
    String name;
    int nun;
    int version;
    String author;
    }
public class Librarys {
    public static void main(String[] args) {
Scanner in=new Scanner (System.in);   
    student inf=new student();
        
    System.out.println("Enter student name : ");
        inf.name=in.next();
        
        System.out.println("Enter student ID : ");
        inf.ID=in.nextInt();
        
        System.out.println("Enter student age : ");
        inf.age=in.nextInt();
        
        System.out.println("Enter student gander : ");
        inf.gander=in.next().charAt(0);
        
        System.out.println("The student name "+inf.name);
        System.out.println("The student age "+inf.age);
        System.out.println("The student ID "+inf.ID);
        System.out.println("The student gander "+inf.gander);
        System.out.println("Enter The size of Library");
        int size =in.nextInt();
    Book book[]=new Book[size];
        for (int counter_of_books = 0; counter_of_books < size; counter_of_books++) {
    book[counter_of_books]=new Book();
            System.out.println("Enter The Name Of Book "+(counter_of_books+1)+" : ");
            book[counter_of_books].name=in.next();
            System.out.println("Enter The Number Of Book "+(counter_of_books+1)+" : ");
            book[counter_of_books].nun=in.nextInt();
            System.out.println("Enter The Author Of Book "+(counter_of_books+1)+" : ");
            book[counter_of_books].author=in.next();
            System.out.println("Enter The Virsion Of Book "+(counter_of_books+1)+" : ");
            book[counter_of_books].version =in.nextInt();
        }
        
        for (int counter_of_books = 0; counter_of_books < size; counter_of_books++) {
            System.out.println("The Name Of Book "+(counter_of_books+1)+" is "+book[counter_of_books].name);
            System.out.println("The Number Of Book "+(counter_of_books+1)+" : "+book[counter_of_books].nun);
            System.out.println("The Author Of Book "+(counter_of_books+1)+" : "+book[counter_of_books].author);
            System.out.println("Enter The Virsion Of Book "+(counter_of_books+1)+" : "+book[counter_of_books].version);
        }
    }
    
}
