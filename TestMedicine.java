package Assignment4;
import java.util.*;
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
			
			Medicine [] md=new Medicine[5];
			Random rad=new Random();
			
			for (int i = 0; i <=2; i++) {

				switch(rad.nextInt(2)+1) {
				case 1:
					md[i] = new Tablet();
					break;
					
				case 2:
					md[i] = new Ointment();
					break;
				case 3:
					md[i] = new Syrup();
					
				}
				System.out.println("Enter Expiry Date:");
				md[i].setExpiryDate(sc.next());
				System.out.println("Enter price");
				md[i].setPrice(sc.nextDouble());				
				md[i].getDetails();
				md[i].displayLable();
			}

			sc.close();
			
			

	}
}


