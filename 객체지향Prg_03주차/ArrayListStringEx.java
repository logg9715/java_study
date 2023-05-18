package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxLength = 0, maxIndex = 0;

		Scanner sc = new Scanner(System.in);

		ArrayList<String> data = new ArrayList<>();

		System.out.println("이름 4개 입력 후 가장 긴 이름 출력");

		for (int i = 0; i < 4; i++) {
			System.out.print("이름 입력 : ");
			data.add(sc.nextLine());
		}

		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).length() > maxLength) {
				maxIndex = i;
				maxLength = data.get(i).length();
			}

		}

		System.out.println("가장 긴 이름 : " + data.get(maxIndex));

		
		sc.close();
	}

}
