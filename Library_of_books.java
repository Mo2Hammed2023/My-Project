package library_of_books;

import java.util.Scanner;

class Book {
	String name, auther, version;
	float id;
}
public class Library_of_books {
	static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
       Book lib = new Book();
		
		System.out.print("Type Book Name : ");
		lib.name = input.nextLine();
		
		System.out.print("Type auther book name : ");
		lib.auther = input.nextLine();
		
		System.out.print("Type version number : ");
		lib.version = input.nextLine();
		
		System.out.print("Type book ID : ");
		lib.id = input.nextFloat();
		System.out.println("\n");
		
		System.out.println("Book Name : " + lib.name);
		
		System.out.println("Book auther : " + lib.auther);
		
		System.out.println("Book version : "+ lib.version);
		
		System.out.println("Book ID : "+ lib.id);
	    
	    
	    System.out.println("\n enter number of books");
	    int size = input.nextInt();
	   Book library[] = new Book[size];
	    
	    
	    for (int i=0; i<size; i++)
	    {
	        input.nextLine();
	        library[i] = new Book();
	        System.out.print("Type Book Name : ");
	        library[i].name = input.nextLine();
	        
	        System.out.print("Type auther book name : ");
	        library[i].auther = input.nextLine();
	        
	        System.out.print("Type version number : ");
	        library[i].version = input.nextLine();
	        
	        System.out.print("Type book ID : ");
	        library[i].id = input.nextFloat();
	        System.out.println("\n");
}
	    
	    
	    for (int i=0; i<size; i++)
	    {
	        System.out.println("Book Name : " + library[i].name);
	        System.out.println("Book auther : " + library[i].auther);
	        System.out.println("Book version : "+ library[i].version);
	        System.out.println("Book ID : "+ library[i].id); }  
	}
    
}
