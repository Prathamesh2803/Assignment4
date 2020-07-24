package Assignment4;

public class NewCustomer {
	String customerName;
	Address residentialAddress;
	Address officialAddress;
	@Override
	public String toString() {
		return "NewCustomer [customerName=" + customerName + ", residentialAddress=" + residentialAddress
				+ ", officialAddress=" + officialAddress + "]";
	}
	public NewCustomer() {
		super();
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public String getNewCustomerDetails() {
		String str= "Customer Name:"+customerName+"\n"+"Residential:"+residentialAddress+"\n"+"Official:"+officialAddress;
		return str;
	}
}
	
	
	
	