package test;

import java.util.ArrayList;

public class PhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Phone> phoneList = new ArrayList<Phone>();

		phoneList.add(new Phone("갤럭시S23", "삼성전자", 1000000));
		phoneList.add(new Phone("갤럭시S20", "삼성전자", 200000));
		phoneList.add(new Phone("아이폰14", "애플", 1500000));
		phoneList.add(new Phone("갤럭시A33", "삼성전자", 300000));
		phoneList.add(new Phone("아이폰13", "애플", 900000));

		System.out.println("삼성폰 명단 : ");

		for (Phone phone : phoneList) {
			if (phone.getCompany().equals("삼성전자"))
				System.out.println(phone.toString());
		}

		System.out.println("\n애플폰 명단 : ");

		for (Phone phone : phoneList) {
			if (phone.getCompany().equals("애플"))
				System.out.println(phone.toString());
		}
		
		System.out.println("\n금액이 100만원 미만인 폰 명단 : ");
		
		for (Phone phone : phoneList) {
			if (phone.getPrice() < 1000000)
				System.out.println(phone.toString());
		}
		
	}

}
