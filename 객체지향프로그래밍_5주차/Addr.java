package study;

import java.time.LocalDateTime;

//주소록 
public class Addr {
	// 필드 선언
	private String name, phoneNum, company;
	private LocalDateTime creatDate;

	// 기본 생성자
	public Addr() {
		this.creatDate = LocalDateTime.now();
	};

	public Addr(String name, String phoneNum, String company, LocalDateTime creatDate) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.company = company;
		this.creatDate = creatDate;
	}

	public LocalDateTime getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(LocalDateTime creatDate) {
		this.creatDate = creatDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", phoneNum=" + phoneNum + ", company=" + company + ", creatDate=" + creatDate + "]";
	}

}