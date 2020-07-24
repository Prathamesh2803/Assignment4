package Assignment4;
import java.util.Scanner;
public class BookDetailsTest {
 public static void main(String[]args) {
	 
	 Scanner sc=new Scanner(System.in);
		Book bk=new Book();
		EngineeringBook book= new EngineeringBook();
		System.out.println("Type of BOOK:");
		System.out.println("Enter the Author Name:");
        bk.setAuthor(sc.nextLine());
        System.out.println("Enter the Book Title:");
        bk.setTitle(sc.nextLine());
        System.out.println("Enter the BOOK NO.:");
        bk.setBookNo(sc.nextInt());
        System.out.println("Enter the Price:");
        bk.setPrice(sc.nextFloat());      
        System.out.println(bk.getBookDetails());
        sc.close();
        
        
 }
}
