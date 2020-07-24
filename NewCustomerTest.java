package Assignment4;
import java.util.Scanner;
public class NewCustomerTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		NewCustomer newCust=new NewCustomer();
		Address add=new Address("Ist Main HSR Layout"," Bangalore");
		newCust.setCustomerName("John");
		newCust.setResidentialAddress(add);
		Address add1=new Address("Ist Main Electronics city"," Bangalore");
		newCust.setOfficialAddress(add1);
		System.out.println(newCust.getNewCustomerDetails());
		sc.close();
		
	}

}
