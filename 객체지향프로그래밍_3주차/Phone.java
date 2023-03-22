package test;

public class Phone {
	// 필드 선언
	private String pName, company;
	private int price;
	
	// 기본 생성자 
	public Phone() {
		
	}
	
	public Phone(String pName, String company, int price) {
		super();
		this.pName = pName;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[pName=" + pName + ", company=" + company + ", price=" + price + "]";
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
