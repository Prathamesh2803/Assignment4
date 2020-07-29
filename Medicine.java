package Assignment4;

public abstract class Medicine {
         double price;
         String expiryDate;
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		public boolean getDetails() {
			System.out.println("Price:"+this.price+"ExpiryDate:"+this.expiryDate);
			return true;
		}
		public abstract void displayLable();
			
		
}

